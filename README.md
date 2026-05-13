# Enterprise Healthcare Automation Framework

This repository demonstrates a robust, scalable UI automation framework designed for complex domain workflows, specifically modeling an Electronic Health Record (EHR) system.

## 🏗️ Architecture & Tech Stack
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Runner / Assertions:** TestNG
* **Design Pattern:** Page Object Model (POM)
* **Build Tool:** Maven
* **CI/CD:** GitHub Actions

## ⚙️ Key Technical Implementations
* **Centralized Element Management:** Utilizing POM to separate test logic from UI object locators, ensuring high maintainability.
* **Dynamic Wait Strategies:** Integrated `WebDriverWait` and `ExpectedConditions` to handle slow-loading healthcare portals and asynchronous API calls gracefully.
* **Automated Pipeline Integration:** Fully integrated with GitHub Actions to trigger regression suites automatically upon code commits.

## 🚀 How to Run Locally

1. Clone the repository to your local machine.
2. Ensure you have Java (JDK 11+) and Maven installed.
3. Run the following command in your terminal to execute the test suite:
   ```bash
   mvn clean test
