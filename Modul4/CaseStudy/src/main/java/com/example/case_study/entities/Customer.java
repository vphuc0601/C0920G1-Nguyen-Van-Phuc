package com.example.case_study.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_id")
    @NotBlank(message = "Customer ID not empty")
    @Pattern(regexp = "^(KH-)\\d{4}$",message = "Format must be KH-xxxx")
    private String customerId;

    @Column(name = "customer_name")
    @NotBlank(message = "Name customer not empty")
    private String customerName;

//    @NotBlank(message = "Customer Birthday not empty")
    @Column(name = "customer_birthday")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @PastOrPresent
    private Date customerBirthday;

    @Column(name = "customer_gender")
    private String customerGender;

    @Column(name = "customer_id_card")
    @NotBlank(message = "ID Card not empty")
    @Pattern(regexp = "^[0-9]{9}", message = "ID Card must be 10 number")
    private String customerIdCard;

    @Column(name = "customer_phone")
    @NotBlank(message = "Phone not empty")
    @Pattern(regexp = "^0\\\\d{9}$", message = "Phone incorrect format")
    private String customerPhone;

    @Column(name = "customer_email")
    @NotBlank(message = "Email not empty")
    @Pattern(regexp = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$", message = "Email incorrect format")
    private String customerEmail;

    @Column(name = "customer_address")
    @NotBlank(message = "Address not empty")
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;

    public Customer(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer() {
    }

    public Customer(Long id, String customerId, String customerName, Date customerBirthday, String customerGender,
                    String customerIdCard, String customerPhone, String customerEmail, String customerAddress) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        LocalDate today = LocalDate.now();
        Date birth = customer.getCustomerBirthday();
        if (birth == null) {
            errors.rejectValue("customerBirthday", "DateNotNull");
        } else {
            LocalDate birthLocal =  birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (Period.between(birthLocal, today).getYears()<18) {
                errors.rejectValue("customerBirthday", "DateCustomer");
            }
        }
    }
}
