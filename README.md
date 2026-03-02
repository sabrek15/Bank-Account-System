# Bank-Account-System

# ☕ Learning Java OOP: Banking System

This repository documents my journey learning **Object-Oriented Programming (OOP)** in Java. 

I built a simple Banking System not just to write code, but to practically implement and understand the four core pillars of OOP: **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.

If you are learning Java (especially coming from C++), this code serves as a clean example of how these concepts work together.

## 📚 Concepts I Implemented

### 1. Abstraction (The Blueprint)
**The Goal:** Prevent the creation of a generic "Bank Account" object, because in the real world, an account must be specific (Savings or Checking).
*   **How I did it:** I marked the `BankAccount` class as `abstract`.
*   **The Code:**
    ```java
    public abstract class BankAccount { ... }
    ```
*   **Lesson:** Abstract classes allow us to define shared logic (like `deposit`) while forcing child classes to define their own specific behaviors.

### 2. Encapsulation (Data Hiding)
**The Goal:** Protect the user's money so it cannot be modified directly (e.g., `account.balance = -500`).
*   **How I did it:** I made the `balance` variable `private` and created public methods (`deposit`, `withdraw`) to control how the data changes.
*   **The Code:**
    ```java
    private double balance; // Cannot be touched directly
    public double getBalance() { ... } // Read-only access
    ```

### 3. Inheritance (Code Reusability)
**The Goal:** Avoid rewriting the `deposit` logic for every single account type.
*   **How I did it:** `SavingsAccount` and `CheckingAccount` use the `extends` keyword to inherit from `BankAccount`.
*   **Lesson:** By using `super(name, startingBalance)`, I can reuse the parent's constructor and methods, keeping my code "DRY" (Don't Repeat Yourself).

### 4. Polymorphism (Method Overriding)
**The Goal:** Allow the `CheckingAccount` to behave differently than a normal account (charging a $1 fee).
*   **How I did it:** I used the `@Override` annotation on the `withdraw` method in the `CheckingAccount` class.
*   **The Code:**
    ```java
    @Override
    public void withdraw(double amount) {
        // Custom logic: Add $1 fee, then call the parent's logic
        super.withdraw(amount + 1);
    }
    ```

## 📂 File Guide

If you are reading the code, here is what to look for in each file:

*   **`BankAccount.java`**: Look here to see **Abstraction** and **Encapsulation**. This is the foundation.
*   **`SavingsAccount.java`**: A simple example of **Inheritance**. It adds a new feature (`interestRate`) on top of the parent.
*   **`CheckingAccount.java`**: Look here to see **Polymorphism**. It modifies the parent's behavior.
*   **`Main.java`**: The entry point where I test the relationships between the objects.

## 🚀 How to Run This Code

If you want to test this on your local machine:

1.  Compile all files:
    ```bash
    javac *.java
    ```
2.  Run the Main class:
    ```bash
    java Main
    ```

## 💭 Final Thoughts
Coming from C++, the biggest difference I noticed is that in Java, all non-static methods are "virtual" by default, making Polymorphism much easier to implement.

---
*This project is for educational purposes.*