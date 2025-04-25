# Operators in Java

## What are Operators?

In Java, **operators** are special symbols used to perform operations on variables and values. Java provides a rich set of operators to perform a variety of tasks, such as mathematical calculations, logical operations, and bitwise manipulations.

## Why Operators are Important?

Operators are fundamental to performing operations in a Java program. They allow you to modify data, compare values, and execute mathematical calculations. Understanding operators is crucial for writing functional and efficient code.

## Types of Operators in Java

Java supports several types of operators:

1. **Arithmetic Operators**
2. **Relational Operators**
3. **Logical Operators**
4. **Bitwise Operators**
5. **Assignment Operators**
6. **Unary Operators**
7. **Ternary Operator**
8. **Instanceof Operator**

### 1. Arithmetic Operators

These operators are used to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

| Operator | Description | Example |
|----------|-------------|---------|
| `+`      | Addition    | `a + b` |
| `-`      | Subtraction | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division    | `a / b` |
| `%`      | Modulus     | `a % b` |

**Example:**

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));  // 15
        System.out.println("Subtraction: " + (a - b));  // 5
        System.out.println("Multiplication: " + (a * b));  // 50
        System.out.println("Division: " + (a / b));  // 2
        System.out.println("Modulus: " + (a % b));  // 0
    }
}
