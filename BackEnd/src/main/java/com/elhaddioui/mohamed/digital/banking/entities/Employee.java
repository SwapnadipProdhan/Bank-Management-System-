package com.elhaddioui.mohamed.digital.banking.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String email;
    private String gender;
    private Date joiningDate;
    private String status;

}

