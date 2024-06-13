package com.example.employee.Repositories;

import com.example.employee.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository is an interface that provides access to data in a database

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
