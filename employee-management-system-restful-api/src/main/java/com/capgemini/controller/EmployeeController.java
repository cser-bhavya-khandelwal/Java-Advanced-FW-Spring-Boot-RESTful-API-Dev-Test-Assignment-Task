package com.capgemini.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.capgemini.model.entity.Employee;
import com.capgemini.model.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return "Employee Saved Successfully";
    }

    @PostMapping("/saveAll")
    public String saveEmployees(@RequestBody List<Employee> employees) {
        employeeService.saveEmployees(employees);
        return "All Employees Saved Successfully";
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }
}