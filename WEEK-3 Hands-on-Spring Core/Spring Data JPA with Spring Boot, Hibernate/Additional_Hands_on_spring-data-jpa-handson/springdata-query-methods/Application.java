package com.example.demo;

import com.example.demo.service.EmployeeService;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Top 3 paid employees:");
        List<Employee> topEmployees = service.top3Paid();
        topEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
    }
}
