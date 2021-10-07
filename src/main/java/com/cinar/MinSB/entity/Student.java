package com.cinar.MinSB.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "student")
public class Student
{
    //AUTO-GENERATE managed by MongoDB
    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "mail")
    private String email;

    @Field(name = "department")
    private Department department;

    @Field(name = "subjects")
    private List<Subject> subjects;

    //Bu anotasyon, collection classında birden fazla constructor olduğunda kullanılır.
    //Kullanılmazsa error alınır.
//    @PersistenceConstructor
//    public Student(String id, String name, String email, Department department, List<Subject> subjects)
//    {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.department = department;
//        this.subjects = subjects;
//    }
//
//    public Student(String id, Department department)
//    {
//        this.id = id;
//        this.department = department;
//    }
}
