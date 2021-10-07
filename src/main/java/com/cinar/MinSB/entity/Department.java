package com.cinar.MinSB.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Department
{
    @Field(name = "department_name")
    private String departmentName;

    @Field(name = "location")
    private String location;
}
