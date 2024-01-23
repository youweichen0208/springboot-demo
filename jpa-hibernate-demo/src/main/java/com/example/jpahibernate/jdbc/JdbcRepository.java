package com.example.jpahibernate.jdbc;

import com.example.jpahibernate.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// This annotation marks this class as a Spring repository, indicating that it's responsible for data access.
@Repository
public class JdbcRepository {

    // This annotation is used for automatic dependency injection. It injects an instance of JdbcTemplate.
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // SQL query template for inserting a student into the 'Student' table.
    private String INSERT =
            """
             insert into Student (id, name, email) values (?, ?, ?);
            """;

    // This method inserts a student into the 'Student' table using the provided JdbcTemplate.
    // The @Transactional annotation ensures that the operation is executed within a transaction.
    @Transactional
    public void insert(Student student) {
        // Executing the SQL update using JdbcTemplate, providing values for the placeholders in the INSERT query.
        jdbcTemplate.update(INSERT, student.getId(), student.getName(), student.getEmail());
    }
}