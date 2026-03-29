Project Title
FinTrack: A Robust Personal Finance Management System

Problem Statement

Managing daily expenses and savings goals manually is prone to errors and lack of historical insight. Most individuals struggle to categorize spending patterns or forecast future savings effectively. FinTrack addresses this by providing a digital solution to record transactions, categorize income/expenses, and visualize financial health. It aims to replace tedious manual logging with a structured, object-oriented Java application that ensures data integrity and provides real-time balance updates.

Target User

The primary users are students and young professionals who need a simple yet effective tool to monitor their budget, track monthly expenditures, and manage savings targets without complex accounting knowledge.
Core Features
Transaction Logging: Add, edit, and delete income and expense entries with timestamps.
Budget Categorization: Automatically sort transactions into categories like Food, Rent, Utilities, and Salary.
Financial Summary: Generate real-time reports showing total balance, total spending, and savings progress.
Data Persistence: Save and load financial records from a local file to ensure data is not lost between sessions.

OOP Concepts Used

Abstraction: Using an abstract class Transaction to define common properties (amount, date) while hiding implementation details from the user.
Inheritance: Implementing specialized classes like Income and Expense that inherit from the base Transaction class.
Polymorphism: Using method overriding to calculate the "impact" of a transaction differently depending on whether it is an Income (positive) or Expense (negative) object.
Exception Handling: Utilizing try-catch blocks to handle invalid user inputs (e.g., entering text in a numeric field) and File I/O errors during data saving.
Collections / Threads:
Collections: Using ArrayList to dynamically store and manage the list of transactions.
Threads: Implementing a background thread to auto-save data every few minutes to prevent data loss.
Proposed Architecture Description
The project follows a Modular Design pattern. The FinanceManager class acts as the controller, managing a List<Transaction>. Data is separated from logic; the Transaction hierarchy handles data, while a FileHandler class manages persistence using Java serialization or CSV formatting. The user interacts through a CLI (Command Line Interface) or a simple JavaFX/Swing GUI.
How to Run
Prerequisites: Ensure Java Development Kit (JDK 11 or higher) is installed.
Clone/Download: Download the project folder and navigate to the src directory.
Compile: Run javac Main.java in your terminal.
Execute: Run java Main to launch the application.
Data: The app will automatically create a data.txt file in the root directory to store your entries.

Git Discipline Notes

Initial commit: Project structure and README setup
feat: Add abstract Transaction class and basic attributes
feat: Implement Income and Expense subclasses (Inheritance)
feat: Add FinanceManager logic for adding transactions
fix: Add Exception Handling for invalid numeric inputs
feat: Integrate ArrayList for dynamic transaction storage
feat: Implement File I/O for data persistence
feat: Add Polymorphic method for calculating net balance
feat: Implement multi-threading for background auto-save
refactor: Final UI polish and code documentation