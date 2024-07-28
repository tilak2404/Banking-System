# Simple Banking System

## Description

The Simple Banking System is a console-based application developed in Java. It allows users to create bank accounts, deposit money, withdraw money, and check account balances. The project demonstrates basic object-oriented programming principles, file handling, and user input management.

## Features

- **Create Account**: Users can create a new bank account by providing an account number, account holder name, and initial balance.
- **Deposit Money**: Users can deposit a specified amount into an existing account.
- **Withdraw Money**: Users can withdraw a specified amount from an existing account, provided there are sufficient funds.
- **Check Balance**: Users can check the balance of an existing account.
- **View All Accounts**: Users can view details of all accounts.

## Skills Demonstrated

- Object-oriented programming
- Collection framework usage
- Basic file handling
- User input management
- CRUD operations (Create, Read, Update, Delete)

## Project Structure

The project is divided into three main files:
- **Account.java**: Defines the `Account` class, which represents a bank account.
- **Bank.java**: Manages a list of `Account` objects and provides methods for account operations.
- **Main.java**: Provides the user interface for the application and handles user input.

## How to Run

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/SimpleBankingSystem.git
    ```

2. Navigate to the project directory:
    ```sh
    cd SimpleBankingSystem
    ```

3. Compile the Java files:
    ```sh
    javac Account.java Bank.java Main.java
    ```

4. Run the application:
    ```sh
    java Main
    ```

## Usage

1. Follow the on-screen instructions to create accounts, deposit money, withdraw money, check balances, and view all accounts.
2. Enter the corresponding number for each operation to navigate through the menu.

## Example

```plaintext
Banking System
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. View All Accounts
6. Exit
Enter your choice: 1
Enter account number: 12345
Enter account holder name: lee
Enter initial balance: 1000
Account created successfully.
