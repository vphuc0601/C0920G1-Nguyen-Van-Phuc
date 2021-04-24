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
    private String employeeId;
    private String employeeName;
    private String employeeBirthday;
    private int employeeIdCard;
    private int employeePhone;
    private String employeeEmail;
    private double employeeSalary;
    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "id")
    private EducationDegree educationDegree;

    public Employee(Division division, Position position, EducationDegree educationDegree) {
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
    }

    public Employee() {
    }

    public Employee(Long id, String employeeId,String employeeName, String employeeBirthday, int employeeIdCard, int employeePhone,
                    String employeeEmail, double employeeSalary) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
    }
}
