package com.example.awsdemo.service;/*
 * @author -Suraj Tiwari
 */

import com.example.awsdemo.entity.Employee;
import com.example.awsdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> findAll(int pageNo,int size) {
    return employeeRepository.findAll(PageRequest.of(pageNo,size, Sort.by("Salary").descending()));
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
