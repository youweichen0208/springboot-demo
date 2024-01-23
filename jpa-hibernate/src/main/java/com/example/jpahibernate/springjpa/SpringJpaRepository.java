package com.example.jpahibernate.springjpa;

import com.example.jpahibernate.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface extends JpaRepository, which is part of Spring Data JPA and provides CRUD operations for entities.
// It is a generic interface where 'Student' is the entity type, and 'Integer' is the type of the entity's primary key.
public interface SpringJpaRepository extends JpaRepository<Student, Integer> {
    // No additional methods are declared here because JpaRepository already provides standard CRUD methods.
    // Spring Data JPA will automatically generate queries based on method names and the structure of the 'Student' entity.
}