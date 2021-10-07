package com.cinar.MinSB.service;

import com.cinar.MinSB.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService
{
    Student createStudent(Student student);

    Student findStudentById(String id);

    List<Student> findAllStudents();

    Student updateStudent(Student student);

    String deleteStudentById(String id);

    List<Student> findStudentsByName(String name);

    Student findStudentsByNameAndEmail(String name, String email);
}
