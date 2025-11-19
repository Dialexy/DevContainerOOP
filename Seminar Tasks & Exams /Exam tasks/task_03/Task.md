## Imeplementation Requirements


1. Alien Interface

Create an interface called Alien with the following methods:

    void takeDamage(int damage) - Processes incoming damage
    boolean isDefeated() - Returns true if health points <= 0
    String getStatus() - Returns a description of the alien's current state
    String getName() - Returns the alien's name
    int getHealthPoints() - Returns current health points

2. BlobAlien Class

Implement the Alien interface with:

    Fields:

        name (String)
        healthPoints (int) - starts at initial value, decreased by damage
        gooinessFactor (double) - between 0.5 and 2.0

Constructor:

        BlobAlien(String name, int healthPoints, double gooinessFactor)

Behaviours:

    takeDamage(int damage): Calculate actual damage as damage × gooinessFactor, then reduce health.
    isDefeated(): Return true if healthPoints <= 0.
    getStatus(): Return string like "BlobAlien [name] - HP: [hp], Gooiness: [factor]".

Additional Method:

    double getGooinessFactor() - Returns the gooiness factor.

3. RobotAlien Class

Implement the Alien interface with:

    Fields:

        name (String)
        healthPoints (int) - starts at initial value, decreased by damage
        batteryPercentage (double) - between 0 and 100

Constructor:

        RobotAlien(String name, int healthPoints, double batteryPercentage)

Behaviours:

        takeDamage(int damage): Calculate actual damage as damage × (batteryPercentage / 100.0), then reduce health.
        isDefeated(): Return true if healthPoints <= 0.
        getStatus(): Return string like "RobotAlien [name] - HP: [hp], Battery: [battery]%".

Additional Method:

        double getBatteryPercentage() - Returns the battery percentage.

