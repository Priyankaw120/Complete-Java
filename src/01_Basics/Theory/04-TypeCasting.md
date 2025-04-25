# Type Casting in Java

## What is Type Casting?

**Type casting** in Java is the process of converting one data type into another. This is important when you need to assign a value of one data type to a variable of another data type. Java provides two types of type casting:

1. **Implicit Casting (Widening)**: Automatically converts smaller data types to larger data types.
2. **Explicit Casting (Narrowing)**: Requires the programmer to manually convert a larger data type to a smaller one.

## Why Type Casting is Important?

Type casting is essential to ensure that data is converted properly, especially when working with different types of variables or performing arithmetic operations. It helps you prevent errors during the compilation or runtime of the program.

## Implicit Type Casting (Widening)

Implicit casting happens when Java automatically converts a smaller data type into a larger one. The conversion is safe and doesn’t require explicit coding.

For example:

```java
int num = 100;
double decimal = num;  // int is automatically converted to double
System.out.println(decimal);  // Output: 100.0
