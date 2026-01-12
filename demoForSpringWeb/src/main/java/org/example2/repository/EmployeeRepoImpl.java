package org.example2.repository;

import org.example2.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

    @Autowired
    JdbcTemplate template;

    @Override
    public int addEmployee(Employee employee) {
        return template.update("insert into employee(id,name,salary) values ('0',?,?)",employee.getName(),employee.getSalary());
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
