# Composite Design Pattern

---

## Overview

This project models the organizational hierarchy of **New Era University** using the **Composite Design Pattern**. It allows the system to treat individual entities (teachers, students) and composite entities (colleges, departments) uniformly through a shared interface.

---

## Project Structure

```
├── EducationalUnit.java   # Component interface
├── College.java           # Composite – can hold any EducationalUnit
├── Department.java        # Composite – holds Teachers and Students
├── Teacher.java           # Leaf – individual teacher
├── Student.java           # Leaf – individual student
└── Main.java              # Client / driver program
```

---

## Design Pattern: Composite

| Role | Class |
|---|---|
| **Component** | `EducationalUnit` *(interface)* |
| **Composite** | `College`, `Department` |
| **Leaf** | `Teacher`, `Student` |

## How It Works

### `EducationalUnit` Interface
Defines three operations every unit must support:
- `displayDetails(String indent)` — prints the unit's info with hierarchy indentation
- `getStudentCount()` — recursively counts all students within the unit
- `getBudget()` — recursively calculates the net budget of the unit

### Budget Formula
```
Budget (College/Department) = Σ teacher salaries − Σ student tuition fees
Budget (Teacher)            = +salary
Budget (Student)            = −tuitionFee
```

---

## Sample Hierarchy (Client Program)

```
New Era University
├── College of Engineering
│   ├── Department of Computer Science
│   │   ├── [Teacher]  Dr. Reyes       | Computer Science | PHP 85,000
│   │   ├── [Teacher]  Prof. Santos    | Algorithms       | PHP 75,000
│   │   ├── [Student]  Juan dela Cruz  | 2024-CS-001      | PHP 25,000
│   │   └── [Student]  Maria Garcia    | 2024-CS-002      | PHP 25,000
│   └── Department of Information Technology
│       ├── [Teacher]  Prof. Lim       | Networking       | PHP 70,000
│       ├── [Student]  Pedro Bautista  | 2024-IT-001      | PHP 22,000
│       └── [Student]  Ana Ramos       | 2024-IT-002      | PHP 22,000
└── College of Business
    ├── [Teacher]  Dr. Cruz            | Finance          | PHP 80,000
    ├── [Student]  Carlo Mendoza       | 2024-BS-001      | PHP 20,000
    └── Department of Management
        ├── [Teacher]  Prof. Torres    | Management       | PHP 68,000
        └── [Student]  Lea Santos      | 2024-MG-001      | PHP 21,000
```
## Key Concepts Demonstrated

- **Composite Pattern** — treats individual objects and compositions uniformly
- **Recursive operations** — `getStudentCount()` and `getBudget()` traverse the entire tree automatically
- **Open/Closed Principle** — new unit types can be added without modifying existing classes
- **Part-whole hierarchy** — a `College` can contain other `College` instances, enabling arbitrary nesting depth

### UML Diagram:
![UML Diagram](https://github.com/angelynbondoc/CompositePattern/blob/main/UML%20Composite%20Design%20Pattern.png)
