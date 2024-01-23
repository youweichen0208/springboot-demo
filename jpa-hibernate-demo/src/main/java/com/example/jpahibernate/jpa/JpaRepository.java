package com.example.jpahibernate.jpa;

import com.example.jpahibernate.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

// The @Repository annotation indicates that this class is a Data Access Object (DAO)
// The @Transactional annotation indicates that this class uses declarative transactions
@Repository
@Transactional
public class JpaRepository {

    // The @PersistenceContext annotation tells Spring to inject an EntityManager instance
    // You can then use this entityManager to interact with the database
    @PersistenceContext
    private EntityManager entityManager;

    // The insert method uses the EntityManager's merge method to either persist a new entity or update an existing one
    // If the student object is new (i.e., it doesn't have an ID or its ID doesn't exist in the database), then merge will persist it as a new entity
    // If the student object is an existing entity (i.e., its ID exists in the database), then merge will update the existing entity with the state of the student object
    public void insert(Student student){
        entityManager.merge(student);
    }

    // The delete method uses the EntityManager to find the Student entity with the given id and remove it from the database
    // If a Student with the given id exists, it is removed
    // If no such Student exists, the remove method will throw an IllegalArgumentException
    public void delete(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

    // The findAll method uses the EntityManager to execute a JPQL query that selects all Student entities
    // The query is "Select name from Student", which selects the names of all Student entities
    // The getResultList method is then called on the Query object to retrieve the results as a List of Student entities
    public List<Student> findAll() {
        return entityManager.createQuery("Select name from Student", Student.class).getResultList();
    }
}