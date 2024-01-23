package com.example.jpahibernate;

import com.example.jpahibernate.jdbc.JdbcRepository;
import com.example.jpahibernate.jpa.JpaRepository;
import com.example.jpahibernate.springjpa.SpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.jpahibernate.Student;
// This annotation marks this class as a Spring component, allowing it to be automatically discovered and registered.
@Component
public class Runner implements CommandLineRunner {

    // This annotation is used for automatic dependency injection. It injects an instance of JdbcRepository.
    @Autowired
    private JdbcRepository repository;

    // This annotation is used for automatic dependency injection. It injects an instance of JpaRepository.
    @Autowired
    private JpaRepository jpaRepository;

    // This annotation is used for automatic dependency injection. It injects an instance of SpringJpaRepository.
    @Autowired
    private SpringJpaRepository springJpaRepository;

    // This method is part of the CommandLineRunner interface and will be executed when the Spring Boot application starts.
    @Override
    public void run(String... args) throws Exception {
        // Inserting two students into the database using the JdbcRepository.
        repository.insert(new Student(1, "Youwei Chen", "adamc18@vt.edu"));
        repository.insert(new Student(2, "Alex", "alex@vt.edu"));

        // Inserting a student into the database using the JpaRepository.
        jpaRepository.insert(new Student(3, "Ann", "ann@vt.edu"));

        // Deleting a student with id 1 from the database using the JpaRepository.
        jpaRepository.delete(1);

        // Printing all students in the database using the JpaRepository.
        System.out.println(jpaRepository.findAll()); // output: [Alex, Ann]

        // Printing the name of the student with id 2 retrieved from the SpringJpaRepository.
        System.out.println(springJpaRepository.findById(2).get().getName()); // output: Alex
    }
}