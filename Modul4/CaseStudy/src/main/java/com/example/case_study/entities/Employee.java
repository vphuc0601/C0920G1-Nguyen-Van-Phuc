package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private Date employeBirthday;
    private int employeeIdCard;
    private int employeePhone;
    private String employeeEmail;
    private int educationDegreeId;
    private int positionId;
    private double employeeSalary;

    public Employee() {
    }

    public Employee(Long id, String employeeName, Date employeBirthday, int employeeIdCard, int employeePhone,
                    String employeeEmail, int educationDegreeId, int positionId, double employeeSalary) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeBirthday = employeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.educationDegreeId = educationDegreeId;
        this.positionId = positionId;
        this.employeeSalary = employeeSalary;
    }
}
