package com.example.csvtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.csvtodb.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
