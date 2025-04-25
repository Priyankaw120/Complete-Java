# Variables in Java

## What is a Variable?

A **variable** is a container used to store data values. In Java, every variable must be declared with a specific type, which defines the kind of data the variable can hold. Variables are used to store data that can be referenced and manipulated within a program.

## Why Are Variables Important?

Variables allow a program to hold and manipulate data during runtime. Without variables, a program would have no way of storing user input, calculations, or temporary results. Variables are fundamental to programming as they enable dynamic interactions and data manipulation.

## Types of Variables in Java

In Java, variables are categorized into **three main types**:

1. **Local Variables**: Declared inside a method, constructor, or block. They are only accessible within that method or block.
2. **Instance Variables**: Declared inside a class but outside any method. They belong to an instance of the class.
3. **Class Variables (Static Variables)**: Declared using the `static` keyword. They are shared among all instances of a class.

## Syntax for Declaring Variables

The syntax to declare a variable in Java is:

```java
<access_modifier> <data_type> <variable_name> [= value];
