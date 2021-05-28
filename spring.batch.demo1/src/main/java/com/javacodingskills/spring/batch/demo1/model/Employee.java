package com.javacodingskills.spring.batch.demo1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    private Integer status;


}
