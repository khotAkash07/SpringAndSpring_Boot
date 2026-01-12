package org.example2.repository;

import org.example2.models.Employee;

import java.util.List;

public interface EmployeeRepo {
    int addEmployee(Employee employee);
    int updateEmployee(int id);
    int deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
}
