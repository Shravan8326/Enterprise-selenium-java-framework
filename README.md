# Enterprise Selenium-Java Automation Framework

This repository represents the core of my mid-career automation expertise. Built during my 3+ years in the Healthcare domain, this framework was designed to handle large-scale regression suites for complex patient management systems.

## 🏗 Framework Architecture
* **Design Pattern:** Page Object Model (POM) for enhanced maintainability.
* **Language/Tools:** Java 11, Selenium WebDriver, TestNG.
* **Build Tool:** Maven (Project Object Model).
* **Reporting:** Extent Reports / Allure.
* **Methodology:** Data-Driven Testing (DDT) using Excel/JSON.

## 💉 Domain Context: Healthcare EHR
The framework targets complex clinical workflows, including:
* Patient Admission & Discharge (E2E flows).
* Medical Billing & Claims validation.
* Regulatory compliance checks (HIPAA data masking).

## 🧠 Key Challenges & Solutions (The "Human" Touch)
* **The Dynamic Element Problem:** In the EHR portal, many IDs were dynamic. I implemented custom **Fluent Waits** and **Relative Locators** to reduce script flakiness by 30%.
* **Synchronization:** Moving away from `Thread.sleep()` to a more robust `ExpectedConditions` utility to handle slow-loading clinical imaging modules.
* **Cross-Browser:** Integrated with Selenium Grid to run tests across Chrome, Firefox, and Edge concurrently.

---

## 📂 Repository Structure
* `/src/main/java`: Page Objects and Base Setup.
* `/src/test/java`: Test Scripts and Test Suites.
* `/config`: Environment properties and global variables.
* `/data`: Test data files (Excel/CSV).
