package com.example.csvtodb.step;

import com.example.csvtodb.entity.Employee;
import com.example.csvtodb.repository.EmployeeRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBItemWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employees) throws Exception {

        System.out.println("Data Saved for Employees: " + employees);
        employeeRepository.saveAll(employees);
    }
}
