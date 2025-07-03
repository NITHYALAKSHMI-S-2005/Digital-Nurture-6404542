package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> searchByName(String keyword) { return repo.findByNameContaining(keyword); }
    public List<Employee> searchByPrefix(String prefix) { return repo.findByNameStartingWith(prefix); }
    public List<Employee> salaryGreaterThan(Double amount) { return repo.findBySalaryGreaterThan(amount); }
    public List<Employee> salaryLessThan(Double amount) { return repo.findBySalaryLessThan(amount); }
    public List<Employee> joinedBetween(LocalDate start, LocalDate end) { return repo.findByDateOfJoiningBetween(start, end); }
    public List<Employee> top3Paid() { return repo.findTop3ByOrderBySalaryDesc(); }
}
