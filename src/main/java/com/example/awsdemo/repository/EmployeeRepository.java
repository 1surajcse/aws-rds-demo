package com.example.awsdemo.repository;/*
 * @author -Suraj Tiwari
 */

import com.example.awsdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
