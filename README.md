# JUnit Testing with Custom ArrayList Implementation

A project designed to learn and practice unit testing with JUnit, using a custom ArrayList implementation as the subject under test.

## Learning Objectives

This project focuses on:

- Understanding and applying JUnit 5 testing principles
- Writing comprehensive test cases that verify functionality
- Following the Arrange-Act-Assert pattern in test design
- Testing edge cases and exception handling
- Practicing test-driven development concepts

## Project Overview

The project consists of a custom ArrayList implementation that serves as the code to be tested:

- A `CustomList<T>` interface that defines the contract for list operations
- A `CustomArrayList<T>` class that implements the interface
- A comprehensive test suite using JUnit 5 to verify the implementation

## Test Coverage

The JUnit test suite demonstrates various testing techniques:

- **Basic Functionality Tests**: Verifying core operations work as expected
- **Edge Case Tests**: Testing boundary conditions and special cases
- **Exception Tests**: Ensuring proper exceptions are thrown when expected
- **Performance Tests**: Testing with large data sets (up to 100,000,000+ elements)
- **Null Handling Tests**: Verifying proper handling of null values

## Test Structure

Each test follows the Arrange-Act-Assert pattern:

```java
@Test
void test_add_1_item() {
    // Arrange
    CustomList<String> customList = new CustomArrayList<>();

    // Act
    customList.add("item " + 10);
    String expectedResult = customList.get(0);
    Integer expectedSize = customList.getSize();

    // Assert
    assertEquals("item 10", expectedResult);
    assertEquals(1, expectedSize);
}
```

## Features Being Tested

The custom ArrayList implementation includes:

- Generic implementation that works with any object type
- Dynamic resizing (automatically doubles capacity when full)
- Standard list operations:
  - Adding elements to the end of the list
  - Inserting elements at a specific index
  - Getting elements by index
  - Removing elements by index
  - Getting the current size of the list
- Exception handling for out-of-bounds operations
- Support for null values

## Implementation Details

- Initial capacity of 10 elements
- Automatic capacity doubling when the array is full
- O(1) time complexity for adding elements at the end
- O(n) time complexity for insertions and removals (due to element shifting)

## Project Structure

- `src/com/coderscampus/arraylist/CustomList.java` - Interface defining the list operations
- `src/com/coderscampus/arraylist/CustomArrayList.java` - Implementation of the CustomList interface
- `test/com/coderscampus/arraylist/CustomArrayListTest.java` - JUnit test cases

## Requirements

- Java 8 or higher
- JUnit 5 for running tests

## License

This project is part of an assignment for Coders Campus.
