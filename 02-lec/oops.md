# OOP Concepts

```text
MAJOR PILLARS
Encapsulation
Absatraction
Polymoorphism
Hierarchy
```

```text
MINOR PILLARS
Typing
Persistence
Concurrency
```
# OOP Concepts

## MAJOR PILLARS
The absolute non-negotiable fundamentals of Object-Oriented Programming.

### 1. Encapsulation
**The Truth:** It is data hiding. You bundle the data (variables) and the methods that operate on them into a single unit (a class). You restrict direct access to the variables to prevent other classes from messing with your data. If you make all your class variables `public`, you are failing at OOP.

**Java Example:**
```java
public class BankAccount {
    // Hidden data
    private double balance; 

    // Controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
```

### 2. Abstraction
The Truth: Hiding the complex, ugly implementation details and exposing only the essential features to the user. You don't need to know how the engine works to press the gas pedal. In Java, we do this using abstract classes and interfaces.

Java Example:

```Java
abstract class Vehicle {
    abstract void startEngine(); // What to do, not how to do it
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Injecting fuel, sparking plugs...");
    }
}
```

### 3. Polymorphism
The Truth: "Many forms." It allows objects of different classes to be treated as objects of a common superclass. The most common form is method overriding, where a child class provides its own specific implementation of a method defined by its parent.

Java Example:

```Java
class Animal {
    void makeSound() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Bark!"); } // Same method, different behavior
}

class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Meow!"); }
}
```
### 4. Hierarchy
The Truth: Structuring your abstractions in a logical tree. In Java, this is primarily implemented through Inheritance. It promotes code reuse but can create tight coupling if abused. Favor composition over inheritance when in doubt.

Java Example:

```Java
class Employee {
    String name;
}

class Manager extends Employee { // Manager IS-A Employee (Hierarchy)
    int teamSize;
}
```

MINOR PILLARS
Secondary concepts that support the major pillars, especially relevant in strong enterprise languages like Java.

### 1. Typing
The Truth: Enforcing the type of an object. Java is statically and strongly typed. The compiler checks your types before the program runs. You cannot assign a text string to a number variable. It prevents stupid mistakes at runtime.

Java Example:

```Java
int age = 25; 
// age = "Twenty Five"; // ERROR: Incompatible types. Java won't allow this.
```
### 2. Persistence
The Truth: Making sure an object's state survives after the program stops running. If you don't save your data to a file or a database, it vanishes from RAM the second your Java application closes.

Java Example:
(Since you are on Day 2, you won't write database connections yet, but here is the basic concept using Java's built-in Serializable interface).

```Java
import java.io.Serializable;

// This tells Java the object's state can be saved to a file/stream
class User implements Serializable {
    String username;
    transient String password; // 'transient' means DO NOT persist this field
}
```

### 3. Concurrency
The Truth: Doing multiple things at the exact same time (multithreading). It is notoriously difficult to get right, leads to race conditions, and causes bugs that are a nightmare to track down. You must learn it for web development because web servers handle thousands of users concurrently.

Java Example:

```Java
class MyTask extends Thread {
    public void run() {
        System.out.println("Running in a separate thread!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        task.start(); // Spawns a new thread, runs alongside the main program
    }
}
```