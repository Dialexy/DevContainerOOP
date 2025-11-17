## Imeplementation Requirements

# Pet Daycare

Requirements

For this challenge please ensure that you:

        Use abstract class for Pet
        Use abstract methods
        Use extends keyword in child classes
        Use super() in constructors
        Implement all abstract methods in child classes

Abstract Parent Class
a) Pet

    Attributes: name (String), age (int), baseFee (double)
    Constructor
    Abstract method: calculateDailyCost() - each pet calculates cost differently
    Abstract method: makeSound() - each pet makes unique sounds
    Regular method: displayInfo() - shows basic pet details (name, age)

Three Child Classes:

a) Dragon

    Additional attribute: fireBreathIntensity (int, scale 1-10)
    Implement calculateDailyCost(): baseFee + (fireBreathIntensity * 50) for fireproof insurance
    Implement makeSound(): prints "ROAAAAR! 🔥"

b) Unicorn

    Additional attribute: glitterLevel (int, scale 1-5)
    Implement calculateDailyCost(): baseFee + (glitterLevel * 30) for extra cleaning
    Implement makeSound(): prints "Neigh... ✨sparkle sparkle✨"

c) NinjaCat

    Additional attribute: stealthLevel (int, scale 1-10)
    Implement calculateDailyCost(): baseFee - (stealthLevel * 10) because you can barely find them
    Implement makeSound(): prints "..." (ninjas are silent!)



# Student

Requirements

Modify the Student class with the following specifications:

        Attributes

    studentId (String)
    name (String)
    grade (int) - must be between 0-100
    isPassing (boolean) - true if grade >= 50

Public Methods:

Constructor

        Requires only the following 3 arguments: String studentId, String name, int grade.

The construtor must also:

        Validate the grade is between 0-100
        Set isPassing correctly

Getters:

    getName() - returns the student's name
    getStudentId() - returns the student ID
    getGrade() - returns the current grade
    isPassing() - returns whether the student is passing

Setters:

        setGrade(int newGrade) - updates the grade:

    The method must validate: grade must be 0-100
    The method must display error message if invalid
    The method must automatically update isPassing flag

Display Method:

    displayInfo() - prints all student information

Validation Rules

    Grade must be between 0-100 (inclusive)
    If invalid grade provided, display error message and don't change grade
    studentId and name cannot be changed after creation (no setters!)
    isPassing must update automatically whenever grade changes



