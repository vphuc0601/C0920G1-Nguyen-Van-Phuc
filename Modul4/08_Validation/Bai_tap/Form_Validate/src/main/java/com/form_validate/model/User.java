package com.form_validate.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Khong duoc de trong")
    @Size(min = 5, max = 45, message = "Ten phai tu 5 ky den 45 ky tu")
    private String firstName;
    @NotBlank(message = "Khong duoc de trong")
    @Size(min = 5, max = 45, message = "Ten phai tu 5 ky den 45 ky tu")
    private String lastName;
    private Integer age;
    private String phoneNumber;
    private String email;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        if (user.age < 18 || user.age > 150){
            errors.rejectValue("age", "student.age.min.max");
        }
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
//        if (phoneNumber.length()>11 || phoneNumber.length()<10){
//            errors.rejectValue("phoneNumber", "phoneNumber.length");
//        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
        if (!email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
        {errors.rejectValue("email","Email khong dung dinh dang");}
    }
}

