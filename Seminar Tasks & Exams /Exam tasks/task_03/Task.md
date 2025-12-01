# Implementation Challenge: Polymorphic Alien Defence System

![Alien Defence System](https://github.com/Edge-Hill-University-Web/Module-Resources/blob/main/CIS2702/task_03_logo_fun.png?raw=true)

Earth is under attack from various types of aliens, and you've been recruited to build the defence system! Different alien species react to attacks in completely different ways, and our weapons must adapt accordingly. Your mission is to implement a polymorphic alien defence system using Java interfaces.

## Scenario

The alien invasion consists of two distinct species:

### 1. Blob Aliens

![Blob Alien](https://github.com/Edge-Hill-University-Web/Module-Resources/blob/main/CIS2702/blob.png?raw=true)

Gelatinous creatures that are incredibly squishy.

**When attacked:**

- Their gooiness factor (a double value between 0.5 and 2.0) affects how much damage they absorb
- Damage calculation: `actualDamage = baseDamage × gooinessFactor`
- Higher gooiness = more damage absorbed (they're so squishy they spread the impact)

### 2. Robot Aliens

![Robot Alien](https://github.com/Edge-Hill-University-Web/Module-Resources/blob/main/CIS2702/robot.png?raw=true)

Mechanical invaders powered by batteries.

**When attacked:**

- Their remaining battery power (0 - 100%) affects their defensive shields
- Damage calculation: `actualDamage = baseDamage × (batteryPercentage / 100.0)`
- Lower battery = weaker shields = more damage taken

## Technical Requirements

### Class Diagram

The class diagram below is for the **Alien Defense system**. It illustrates the relationships between the `Alien` interface and its concrete implementations, `BlobAlien` and `RobotAlien`, along with their shared methods and overridden behaviours.

### 1. Alien Interface

Create an interface called `Alien` with the following methods:

- `void takeDamage(int damage)` - Processes incoming damage
- `boolean isDefeated()` - Returns true if health points <= 0
- `String getStatus()` - Returns a description of the alien's current state
- `String getName()` - Returns the alien's name
- `int getHealthPoints()` - Returns current health points

### 2. BlobAlien Class

Implement the `Alien` interface with:

**Fields:**

- `name` (String)
- `healthPoints` (int) - starts at initial value, decreased by damage
- `gooinessFactor` (double) - between 0.5 and 2.0

**Constructor:**

```java
BlobAlien(String name, int healthPoints, double gooinessFactor)
```

**Behaviours:**

- `takeDamage(int damage)`: Calculate actual damage as `damage × gooinessFactor`, then reduce health.
- `isDefeated()`: Return true if `healthPoints <= 0`.
- `getStatus()`: Return string like `"BlobAlien [name] - HP: [hp], Gooiness: [factor]"`.

**Additional Method:**

- `double getGooinessFactor()` - Returns the gooiness factor.

### 3. RobotAlien Class

Implement the `Alien` interface with:

**Fields:**

- `name` (String)
- `healthPoints` (int) - starts at initial value, decreased by damage
- `batteryPercentage` (double) - between 0 and 100

**Constructor:**

```java
RobotAlien(String name, int healthPoints, double batteryPercentage)
```

**Behaviours:**

- `takeDamage(int damage)`: Calculate actual damage as `damage × (batteryPercentage / 100.0)`, then reduce health.
- `isDefeated()`: Return true if `healthPoints <= 0`.
- `getStatus()`: Return string like `"RobotAlien [name] - HP: [hp], Battery: [battery]%"`.

**Additional Method:**

- `double getBatteryPercentage()` - Returns the battery percentage.

## Implementation Guidelines

### Package Structure

```
src/main/java/com/university/aliendefense/
├── Alien.java
├── BlobAlien.java
└── RobotAlien.java
```

### Key Considerations

- **Encapsulation:** All fields should be private.
- **Validation:** Ensure gooiness factor is between 0.5–2.0, battery is 0–100%.
- **Polymorphism:** Both classes must properly implement the Alien interface.
- **Precision:** Use appropriate data types (int for health, double for factors/percentages).
- **Health Points:** Cannot go below 0 (if damage exceeds current HP, set to 0).
