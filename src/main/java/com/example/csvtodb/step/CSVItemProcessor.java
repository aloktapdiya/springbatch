package com.example.csvtodb.step;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.csvtodb.entity.Employee;

import java.util.Date;

@Component
public class CSVItemProcessor implements ItemProcessor<Employee, Employee> {


    @Override
    public Employee process(Employee employee) throws Exception {
        employee.setTime(new Date()); // creation Time
        return employee;
    }
}
