# Implementation Challenge 1: Student Grade Tracker

Create a `Student` class that safely manages student information and grades using proper encapsulation techniques.

## Requirements

Modify the `Student` class with the following specifications:

### Attributes

- `studentId` (String)
- `name` (String)
- `grade` (int) - must be between 0-100
- `isPassing` (boolean) - true if grade >= 50

### Public Methods

#### Constructor

The class must only have **1 constructor**:

```java
Student(String studentId, String name, int grade)
```

The constructor must also:

- Validate the grade is between 0-100
- Set `isPassing` correctly

#### Getters

- `getName()` - returns the student's name
- `getStudentId()` - returns the student ID
- `getGrade()` - returns the current grade
- `isPassing()` - returns whether the student is passing

#### Setters

`setGrade(int newGrade)` - updates the grade:

- The method must validate: grade must be 0-100
- The method must display error message if invalid
- The method must automatically update `isPassing` flag

#### Display Method

- `displayInfo()` - prints all student information

## Validation Rules

- Grade must be between 0-100 (inclusive)
- If invalid grade provided, display error message and don't change grade
- `studentId` and `name` cannot be changed after creation (no setters!)
- `isPassing` must update automatically whenever grade changes
