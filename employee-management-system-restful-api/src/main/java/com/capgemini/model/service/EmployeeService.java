package com.capgemini.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.model.entity.Employee;
import com.capgemini.model.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void saveEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }
}