package com.example.awsdemo.entity;/*
 * @author -Suraj Tiwari
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @SequenceGenerator(name = "emp_seq",sequenceName = "emp_seq",allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  int id;
    private String name;
    private int age;
    private double salary;
}
