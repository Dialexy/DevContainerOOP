# Implementation Challenge 2: Unusual Pet Day Care

You run a very special pet daycare that only accepts unusual pets. Each pet type has different care requirements and daily fees. Build a system to calculate daily care costs!

## Requirements

For this challenge please ensure that you:

- Use abstract class for `Pet`
- Use abstract methods
- Use `extends` keyword in child classes
- Use `super()` in constructors
- Implement all abstract methods in child classes

## Abstract Parent Class

### a) Pet

- **Attributes:** `name` (String), `age` (int), `baseFee` (double)
- **Constructor**
- **Abstract method:** `calculateDailyCost()` - each pet calculates cost differently
- **Abstract method:** `makeSound()` - each pet makes unique sounds
- **Regular method:** `displayInfo()` - shows basic pet details (name, age)

## Three Child Classes

### a) Dragon

- **Additional attribute:** `fireBreathIntensity` (int, scale 1-10)
- **Implement `calculateDailyCost()`:** `baseFee + (fireBreathIntensity * 50)` for fireproof insurance
- **Implement `makeSound()`:** prints `"ROAAAAR! 🔥"`

### b) Unicorn

- **Additional attribute:** `glitterLevel` (int, scale 1-5)
- **Implement `calculateDailyCost()`:** `baseFee + (glitterLevel * 30)` for extra cleaning
- **Implement `makeSound()`:** prints `"Neigh... ✨sparkle sparkle✨"`

### c) NinjaCat

- **Additional attribute:** `stealthLevel` (int, scale 1-10)
- **Implement `calculateDailyCost()`:** `baseFee - (stealthLevel * 10)` because you can barely find them
- **Implement `makeSound()`:** prints `"..."` (ninjas are silent!)
