package org.example2.service;

import org.example2.models.Employee;

import java.util.List;

public interface EmployeeService {
    int addEmployee(Employee employee);
    int updateEmployee(int id);
    int deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
}
