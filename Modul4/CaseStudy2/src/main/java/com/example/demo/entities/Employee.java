package com.example.demo.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employee_id", columnDefinition = "VARCHAR(255)")
    private String employeeId;
    @Column(name = "employee_name",columnDefinition = "VARCHAR(255)")
    private String employeeName;
    @Column(name = "employee_birthday", columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employeeBirthday;
    @Column(name = "employee_id_card", columnDefinition = "VARCHAR(255)")
    private String employeeIdCard;
    @Column(name = "employee_salary", columnDefinition = "DOUBLE")
    private String employeeSalary;
    @Column(name = "employee_phone", columnDefinition = "INT")
    private String employeePhone;
    @Column(name = "employee_email", columnDefinition = "VARCHAR(255)")
    private String employeeEmail;
    @Column(name = "employee_address", columnDefinition = "VARCHAR(255)")
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "id")
    private EducationDegree educationDegree;

   @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
   private Set<Contract> contract;

    @OneToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name" )
    private User user;

    public Employee() {
    }

    public Employee(Long id, String employeeId, String employeeName, Date employeeBirthday, String employeeIdCard,
                    String employeeSalary, String employeePhone, String employeeEmail, String employeeAddress) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
    }
}
