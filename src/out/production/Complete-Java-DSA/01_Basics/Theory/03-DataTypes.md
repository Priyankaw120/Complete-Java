# Data Types in Java

## What is a Data Type?

A **data type** defines the type of data a variable can hold in Java. It specifies what kind of operations can be performed on the data, the size of the data, and how the data is stored in memory. Java is a statically typed language, meaning that every variable must be declared with a data type before use.

## Why Data Types Matter?

Understanding data types is crucial because they ensure that the program operates with the correct values, preventing errors that may arise from incorrect data manipulation. Choosing the appropriate data type helps to optimize memory usage and enhances program performance.

## Types of Data Types in Java

Java has two major categories of data types:

### 1. **Primitive Data Types**

Primitive data types are predefined in Java and represent simple values. These types are **not objects** and hold single values.

Here are the eight primitive data types in Java:

| Type       | Size       | Default Value | Description                                   |
|------------|------------|---------------|-----------------------------------------------|
| `byte`     | 1 byte     | 0             | Represents small integers.                   |
| `short`    | 2 bytes    | 0             | Represents larger integers than `byte`.      |
| `int`      | 4 bytes    | 0             | Standard integer type.                       |
| `long`     | 8 bytes    | 0L            | Represents larger integers.                  |
| `float`    | 4 bytes    | 0.0f          | Represents floating-point numbers.           |
| `double`   | 8 bytes    | 0.0d          | Represents more precise floating-point numbers. |
| `char`     | 2 bytes    | '\u0000'      | Represents a single character.               |
| `boolean`  | 1 byte     | `false`       | Represents a value of `true` or `false`.     |

#### Example of Primitive Data Types:

```java
byte b = 127;              // byte type
short s = 10000;           // short type
int i = 500000;            // int type
long l = 100000L;          // long type
float f = 10.5f;           // float type
double d = 20.99;          // double type
char c = 'A';              // char type
boolean flag = true;       // boolean type
