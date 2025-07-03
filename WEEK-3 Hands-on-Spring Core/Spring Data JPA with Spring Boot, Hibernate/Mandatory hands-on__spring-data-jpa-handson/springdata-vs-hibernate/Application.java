package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John Doe");
        employeeService.addEmployee(emp);
        System.out.println("EmployeeService:");
        System.out.println("- Saved Employee: Employee [id:"+emp.getId() +", name:"+emp.getName()+"]");
    }
}

