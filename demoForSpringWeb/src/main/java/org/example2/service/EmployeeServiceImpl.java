package org.example2.service;

import org.example2.models.Employee;
import org.example2.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public int addEmployee(Employee employee) {
        return employeeRepo.addEmployee(employee);
    }

    @Override
    public int updateEmployee(int id) {
        return 0;
    }

    @Override
    public int deleteEmployee(int id) {
        return 0;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}
