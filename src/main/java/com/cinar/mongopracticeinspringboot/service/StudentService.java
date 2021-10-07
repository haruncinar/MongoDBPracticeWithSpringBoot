package com.cinar.mongopracticeinspringboot.service;

import com.cinar.mongopracticeinspringboot.entity.Student;

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

    List<Student> findStudentsByNameOrEmail(String name, String email);

    List<Student> findAllStudentsWithPagination(int pageNo, int pageSize);
}
