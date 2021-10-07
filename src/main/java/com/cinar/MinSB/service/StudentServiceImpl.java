package com.cinar.MinSB.service;

import com.cinar.MinSB.entity.Student;
import com.cinar.MinSB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService
{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public Student createStudent(Student student)
    {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(String id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudents()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student)
    {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudentById(String id)
    {
        try
        {
            studentRepository.deleteById(id);
            return "Silme işlemi başarılı";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

    @Override
    public List<Student> findStudentsByName(String name)
    {
        return studentRepository.findByName(name);
    }

    @Override
    public Student findStudentsByNameAndEmail(String name, String email)
    {
        return studentRepository.findByNameAndEmail(name, email);
    }
}
