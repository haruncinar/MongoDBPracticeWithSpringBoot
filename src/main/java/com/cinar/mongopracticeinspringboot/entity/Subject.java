package com.cinar.mongopracticeinspringboot.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Subject
{
    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "version")
    private String version;
}
