
# Concept of Normalization in DBMS

Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It divides large tables into smaller, related tables and establishes relationships between them using keys.

---

## Why Normalize?

Without normalization, databases may suffer from:

- **Data Redundancy** – Duplicate data stored in multiple places.
- **Insertion Anomaly** – Difficulty inserting data without unrelated information.
- **Update Anomaly** – Same data must be updated in multiple rows.
- **Deletion Anomaly** – Deleting a record may unintentionally remove important information.

---

## Types of Anomalies

### Insertion Anomaly

Occurs when a record cannot be inserted without the presence of additional unrelated data.

### Update Anomaly

Occurs when the same information is stored in multiple rows and must be updated in multiple places.

### Deletion Anomaly

Occurs when deleting a record unintentionally removes additional important information.

---

# Normal Forms

Normalization is performed through a series of stages known as **Normal Forms (NF)**.

---

## First Normal Form (1NF)

A table is in First Normal Form if:

- Each column contains atomic (indivisible) values.
- Repeating groups are not allowed.
- Every row can be uniquely identified using a Primary Key.
- Each column contains values of a single data type.

### Example (Not in 1NF)

| StudentID | StudentName | Subjects |
|------------|------------|----------|
| 101 | John | Math, Physics |

### Converted to 1NF

| StudentID | StudentName | Subject |
|------------|------------|---------|
| 101 | John | Math |
| 101 | John | Physics |

---

## Second Normal Form (2NF)

A table is in Second Normal Form if:

- It is already in 1NF.
- Every non-key attribute depends on the entire Primary Key.
- Partial dependency is removed.

### Example

| StudentID | CourseID | StudentName | CourseName |
|------------|------------|------------|------------|

Here:

- `StudentName` depends only on `StudentID`
- `CourseName` depends only on `CourseID`

To achieve 2NF:

- Students(StudentID, StudentName)
- Courses(CourseID, CourseName)
- Enrollments(StudentID, CourseID)

### Formal Definition of 2NF

A table is in Second Normal Form if:

> Every non-prime attribute is fully functionally dependent on every candidate key.

#### Important Terms

- **Candidate Key**: An attribute or combination of attributes that uniquely identifies a row.
- **Prime Attribute**: An attribute that belongs to at least one candidate key.
- **Non-Prime Attribute**: An attribute that does not belong to any candidate key.

A table violates 2NF when a non-prime attribute depends on only part of a candidate key rather than the entire candidate key.

---

## Third Normal Form (3NF)

A table is in Third Normal Form if:

- It is already in 2NF.
- No transitive dependency exists.
- Non-key attributes depend only on the Primary Key.

### Example

| EmployeeID | EmployeeName | Department | HOD |
|------------|-------------|------------|-----|

Here:

- `HOD` depends on `Department`
- `Department` depends on `EmployeeID`

This creates a transitive dependency.

To achieve 3NF:

- Employees(EmployeeID, EmployeeName, DepartmentID)
- Departments(DepartmentID, DepartmentName, HOD)

### Formal Definition of 3NF

A table is in Third Normal Form if:

> Every non-prime attribute depends on every candidate key, does not depend on part of a candidate key, and does not depend on another non-prime attribute.

This removes:

- Partial dependencies
- Transitive dependencies

and ensures that non-prime attributes depend only on candidate keys.

---

## Boyce-Codd Normal Form (BCNF)

BCNF is a stricter version of 3NF.

A table is in BCNF if:

> For every functional dependency X → Y, X must be a super key.

In simple terms:

> Every attribute should depend on the key, the whole key, and nothing but the key.

BCNF removes certain anomalies that may still remain in some 3NF tables.

---

## Fourth Normal Form (4NF)

A table is in Fourth Normal Form if:

- It is already in BCNF.
- No multi-valued dependencies exist.

### Example

If a student can have multiple hobbies and multiple skills:

| Student | Hobby | Skill |
|----------|--------|--------|

This may lead to unnecessary duplication and should be decomposed into separate tables.

---

## Fifth Normal Form (5NF)

A table is in Fifth Normal Form if:

- It is already in 4NF.
- It cannot be further decomposed without losing information.

5NF removes join dependencies and is generally used only in highly complex database systems.

---

## Summary

| Normal Form | Purpose |
|------------|---------|
| 1NF | Remove repeating groups and ensure atomic values |
| 2NF | Remove partial dependency |
| 3NF | Remove transitive dependency |
| BCNF | Every determinant must be a candidate key |
| 4NF | Remove multi-valued dependency |
| 5NF | Remove join dependency |

---

## Conclusion

Normalization improves database design by reducing redundancy, eliminating anomalies, and maintaining data consistency. Most practical database systems are normalized up to 3NF or BCNF, providing a good balance between data integrity and performance.

