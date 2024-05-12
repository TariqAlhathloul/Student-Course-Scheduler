
CREATE TABLE Courses (
    CourseCode INT PRIMARY KEY,
    CourseName VARCHAR(255) NOT NULL,
    DepartmentName INT NOT NULL,
    Credits INT NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

