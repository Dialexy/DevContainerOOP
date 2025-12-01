# Implementation Challenge: Book Management System

Create a `Book` class that represents a book with basic information and proper encapsulation.

## Requirements

### Attributes

All attributes must be declared as `private` and `final`:

- `title` (String) - The title of the book
- `author` (String) - The author of the book
- `pages` (int) - The number of pages in the book

### Constructor

The class must have **one constructor**:

```java
Book(String title, String author, int pages)
```

The constructor must:
- Initialize all three fields (`title`, `author`, `pages`)
- Accept parameters in the order: title, author, pages

### Public Methods

#### Getters

- `getTitle()` - returns the book's title
- `getAuthor()` - returns the book's author
- `getPages()` - returns the number of pages

#### Display Method

- `displayDetails()` - prints the book's information in the following format:
  ```
  Title: [title], Author: [author], Pages: [pages]
  ```

## Implementation Rules

- All fields must be declared `private` and `final`
- No setters are allowed (immutable class)
- The `displayDetails()` method must use the getter methods to access the fields
- Fields cannot be changed after object creation

## Example Usage

```java
Book book = new Book("1984", "George Orwell", 328);
book.displayDetails();
// Output: Title: 1984, Author: George Orwell, Pages: 328
```
