package com.example.awsdemo.dto;/*
 * @author -Suraj Tiwari
 */

import com.example.awsdemo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto {
    private List<Employee> list;
    private int size;
}
