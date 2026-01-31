package org.example2;

import org.example2.config.DBConfig;
import org.example2.models.Employee;
import org.example2.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
        EmployeeService emplService = context.getBean(EmployeeService.class);

        Scanner sc = new Scanner(System.in);
        JdbcTemplate template = (JdbcTemplate) context.getBean("template");
        if(template != null) {
            System.out.println("database connection established");
        do{
        System.out.println("Enter your choice :");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4: Show All Employees");
        int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name and salary for employee");
                    sc.nextLine();
                    int result = emplService.addEmployee(new Employee(sc.nextLine(),sc.nextInt()));
                    System.out.println(result > 0 ? "Employee inserted successfully" : "Employee insert failed");
                    break;
                case 2:
                    System.out.println("Enter id for employee which you want to update");
                    int id = sc.nextInt();
                    System.out.println("Enter choice to update\n1. Name\n2. Salary");
                    int updateChoice = sc.nextInt();
                    switch (updateChoice) {
                        case 1:
                            System.out.println("Enter new name to employee");
                            sc.nextLine();
                            String newName = sc.nextLine();
                            template.update("update employee set name=? where id=?",newName,id);
                            break;
                        case 2:
                            System.out.println("Enter new salary to employee");
                            sc.nextLine();
                            int newSalary = sc.nextInt();
                            template.update("update employee set salary=? where id=? ", newSalary, id);
                           break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    System.out.println("Enter id for employee to delete employee");
                    int empId = sc.nextInt();

                    int delResult = template.update("delete from employee where id=?",(PreparedStatement ps)->{ps.setInt(1, empId);});
                    System.out.println(delResult>0?"Employee Deleted Successfully":"Error....!");
                    break;
                case 4:
                    List<Employee> empList = template.query("select *from employee", (ResultSet rs, int rowNum) ->
                            new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3)));
                    empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
        }else{
            System.out.println("database connection not established");
        }
        context.close();
    }
}