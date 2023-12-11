package com.elhaddioui.mohamed.digital.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elhaddioui.mohamed.digital.banking.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByFirstName(String name);
}
