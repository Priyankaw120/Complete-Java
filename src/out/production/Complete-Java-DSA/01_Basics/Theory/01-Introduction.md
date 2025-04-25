# Introduction to Java

## What is a Computer Language?

A **computer language** is a set of instructions used to communicate with a computer. It allows developers to give commands to a computer to perform specific tasks. These instructions can be simple or complex and can be used for a variety of applications such as web development, mobile applications, data processing, etc.

### Types of Programming Languages
- **Low-Level Languages**: Directly interact with the hardware. Examples: Assembly, Machine Code.
- **High-Level Languages**: Abstracted from machine code, easier for humans to read. Examples: Java, Python, C++.
- **Scripting Languages**: Typically used for automating tasks. Examples: JavaScript, PHP, Bash.
- **Domain-Specific Languages**: Designed for specific tasks. Example: SQL (for databases).

## Why Java?

Java is one of the most popular **high-level programming languages**. It is designed to have the following features:
- **Portability**: Write once, run anywhere. Java applications are platform-independent due to the Java Virtual Machine (JVM).
- **Object-Oriented**: Everything in Java is treated as an object, making it easier to manage and scale.
- **Secure**: Java provides a secure execution environment through bytecode verification and access control.
- **Multithreading**: Supports the development of applications that can perform multiple tasks simultaneously.
- **Rich API**: Java offers a wide range of libraries and tools to help developers in creating applications.

Java is used in a variety of applications, from web development to mobile app development and enterprise software.

## History of Java

Java was created by **James Gosling** and **Mike Sheridan** in 1991 at Sun Microsystems, which was later acquired by Oracle Corporation. It was originally developed as a part of the **"Green Project"** and aimed to be a platform-independent language. The first public release of Java was in **1995**.

### Key Milestones in Java’s History:
- **1995**: Java 1.0 was released.
- **2004**: Java 5 introduced generics and metadata annotations.
- **2009**: Oracle acquired Sun Microsystems.
- **2017**: Java 9 introduced the module system.

## Java Memory Management

Java's memory management system is one of the reasons for its success and reliability. Java uses **Automatic Garbage Collection (GC)** to manage memory, meaning developers do not need to manually allocate and deallocate memory. The JVM automatically handles memory for you, which reduces errors and enhances performance.

### Key Components of Java Memory Management:
- **Heap Memory**: Where objects are stored. The JVM uses garbage collection to free memory when objects are no longer needed.
- **Stack Memory**: Used for method execution and local variables.
- **Method Area**: Stores class structures like runtime constant pool, field, and method data.

## Setting Up Java

### Prerequisites:
- **Java Development Kit (JDK)**: Contains tools required for developing Java programs.
- **Java Runtime Environment (JRE)**: Allows running Java applications but does not include development tools.

### Steps for Setting Up Java:
1. **Download JDK**: Visit the [official Oracle JDK download page](https://www.oracle.com/java/technologies/javase-downloads.html).
2. **Install the JDK**: Follow the instructions on the installer to install Java on your system.
3. **Set Environment Variables**:
    - Set `JAVA_HOME` to the JDK installation path.
    - Update the `PATH` variable to include the `bin` directory of the JDK.
4. **Verify Installation**: Open a terminal/command prompt and run:
   ```bash
   java -version
   javac -version
