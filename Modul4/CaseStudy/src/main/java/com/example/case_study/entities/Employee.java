package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "ID not empty")
    @Pattern(regexp = "^(NV-)\\d{4}$", message = "Employee Id must be NV-xxxx")
    @Column(columnDefinition = "VARCHAR(255)")
    private String employeeId;

    @NotBlank(message = "Name not empty")
    @Column(columnDefinition = "VARCHAR(255)")
    private String employeeName;

    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "DATETIME")
    private Date employeeBirthday;

    @NotBlank(message = "Not empty")
    @Pattern(regexp = "^[0-9]{9}", message = "ID Card must be 10 number")
    @Column(columnDefinition = "VARCHAR(255)")
    private String employeeIdCard;

    @NotBlank(message = "Phone not empty")
    @Pattern(regexp = "^0[0-9]{9}$", message = "Phone incorrect format")
    @Column(columnDefinition = "INT")
    private String employeePhone;

    @NotBlank(message = "Email not empty")
    @Pattern(regexp = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$", message = "Email incorrect format")
    @Column(columnDefinition = "VARCHAR(255)")
    private String employeeEmail;

    @NotBlank(message = "Salary not Empty")
//    @Pattern(regexp = "^\\d+$", message = "Salary incorrect format")
    @Positive(message = "Salary incorrect")
    @Column(columnDefinition = "DOUBLE")
    private String employeeSalary;

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

    public Employee(Long id, String employeeId,String employeeName, Date employeeBirthday, String employeeIdCard, String employeePhone,
                    String employeeEmail, String employeeSalary) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        LocalDate today = LocalDate.now();
        Date birth = employee.getEmployeeBirthday();
        if (birth == null) {
            errors.rejectValue("employeeBirthday", "DateNotNull");
        } else {
            LocalDate birthLocal =  birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (Period.between(birthLocal, today).getYears()<18) {
                errors.rejectValue("employeeBirthday", "DateCustomer");
            }
        }
    }
}
