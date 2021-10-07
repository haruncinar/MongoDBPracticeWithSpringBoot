package com.cinar.mongoInSB.repository;

import com.cinar.mongoInSB.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>
{
    List<Student> findByName(String name);

    Student findByNameAndEmail(String name, String email);
}