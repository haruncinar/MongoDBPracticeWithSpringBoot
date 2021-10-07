package com.cinar.MinSB.repository;

import com.cinar.MinSB.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>
{
    List<Student> findByName(String name);

    Student findByNameAndEmail(String name, String email);
}
