package com.example.jpahibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// This annotation indicates that this class is a JPA entity, mapped to a database table.
@Entity
public class Student {

    // This annotation defines the primary key of the entity.
    @Id
    private int id;

    // This annotation specifies that the 'name' field should be mapped to a database column.
    @Column
    private String name;

    // This annotation also specifies that the 'email' field should be mapped to a database column.
    @Column
    private String email;

    // Default constructor required by JPA. Should be public or protected.
    public Student() {
    }

    // Constructor to initialize the entity with values.
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter method for retrieving the 'id' field.
    public int getId() {
        return id;
    }

    // Getter method for retrieving the 'name' field.
    public String getName() {
        return name;
    }

    // Getter method for retrieving the 'email' field.
    public String getEmail() {
        return email;
    }

    // Setter method for setting the 'id' field.
    public void setId(int id) {
        this.id = id;
    }

    // Setter method for setting the 'name' field.
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for setting the 'email' field.
    public void setEmail(String email) {
        this.email = email;
    }
}