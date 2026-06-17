# 👔 Employee Management System

A Java console application to manage employee records using 
**JDBC**, **DAO pattern** and **MySQL** database.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Database | MySQL |
| Connectivity | JDBC |
| Pattern | DAO (Data Access Object) |
| IDE | Eclipse |

---

## 📂 Project Structure
EmployeeManagement/

├── ConnctionFactory/

│   └── ConnectionFactory.java    → MySQL database connection

├── EmployeeDTO/

│   └── Employee.java             → Employee model class

├── EmployeeDAO/

│   ├── EmployeeDAO.java          → DAO interface

│   └── EmployeeDAOImpl.java      → JDBC CRUD implementation

└── Main/

└── DAODriver.java            → Main program entry point

---

## ✨ Features

- ➕ Add new employee
- 📋 View all employees
- 🔍 Search employee by ID
- ✏️ Update employee details
- 🗑️ Delete employee

---

## ⚙️ How to Run

**Step 1 — Setup MySQL Database:**
```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    emp_id       INT PRIMARY KEY AUTO_INCREMENT,
    emp_name     VARCHAR(100) NOT NULL,
    department   VARCHAR(100),
    email        VARCHAR(100) UNIQUE,
    salary       DOUBLE
);
```

**Step 2 — Update credentials in `ConnectionFactory.java`:**
```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "root";
String password = "your_password"; // ← change this
```

**Step 3** — Add **MySQL connector JAR** to build path

**Step 4** — Run `DAODriver.java` ✅

---

## 👩‍💻 Developer

Made with ❤️ by [suma-dev-12](https://github.com/suma-dev-12)
