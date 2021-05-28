package com.javacodingskills.spring.batch.demo1.mapper;

import com.javacodingskills.spring.batch.demo1.dto.EmployeeDTO;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class EmployeeFileRowMapper implements FieldSetMapper<EmployeeDTO> {

    @Override
    public EmployeeDTO mapFieldSet(FieldSet fieldSet) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(fieldSet.readInt("id"));
        employee.setName(fieldSet.readString("name"));
        employee.setStatus(fieldSet.readInt("status"));

        return employee;
    }

}
