package com.example.awsdemo.controller;/*
 * @author -Suraj Tiwari
 */

import com.example.awsdemo.entity.Employee;
import com.example.awsdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/status")
    public String getData(){
        return "Welcome..to AWS";
    }
    @GetMapping("/pagination/{pageNo}/{size}")
    public Page<Employee> getEmployees(@PathVariable int pageNo,@PathVariable int size){
        return employeeService.findAll(pageNo,size);
    }
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
