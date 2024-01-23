-- This table stores information about students.

CREATE TABLE Student
(
    -- Unique identifier for each student.
    id    INT PRIMARY KEY,

    -- The name of the student (maximum length: 255 characters).
    name  VARCHAR(255) NOT NULL,

    -- The email address of the student (maximum length: 255 characters).
    email VARCHAR(255) NOT NULL
);