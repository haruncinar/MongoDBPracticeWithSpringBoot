package com.cinar.mongopracticeinspringboot.controller;

import com.cinar.mongopracticeinspringboot.entity.Student;
import com.cinar.mongopracticeinspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentMongoBootController
{
    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student findStudentById(@PathVariable String id)
    {
        return studentService.findStudentById(id);
    }

    @GetMapping("/getAllStudents")
    public List<Student> findAllStudents()
    {
        return studentService.findAllStudents();
    }

    @PutMapping("/editStudent")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable String id)
    {
        return studentService.deleteStudentById(id);
    }

    @GetMapping("/getStudentsByName/{name}")
    public List<Student> findStudentsByName(@PathVariable String name)
    {
        return studentService.findStudentsByName(name);
    }

    @GetMapping("/getStudentsByNameAndMail")
    public Student findStudentsByNameAndMail(@RequestParam String name, @RequestParam String email)
    {
        return studentService.findStudentsByNameAndEmail(name, email);
    }

    @GetMapping("/getStudentsByNameOrEmail")
    public List<Student> findStudentsByNameOrMail(@RequestParam String name, @RequestParam String email)
    {
        return studentService.findStudentsByNameOrEmail(name, email);
    }

    @GetMapping("/getAllWithPagination")
    public List<Student> findAllStudentsWithPagination(@RequestParam int pageNo, @RequestParam int pageSize)
    {
        return studentService.findAllStudentsWithPagination(pageNo, pageSize);
    }
}
