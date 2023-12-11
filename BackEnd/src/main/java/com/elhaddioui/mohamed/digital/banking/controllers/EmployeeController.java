package com.elhaddioui.mohamed.digital.banking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elhaddioui.mohamed.digital.banking.entities.CustomResponse;
import com.elhaddioui.mohamed.digital.banking.entities.Employee;
import com.elhaddioui.mohamed.digital.banking.services.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/add/multiple")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveEmployees(employees);
    }

    @GetMapping("/all")
    public List<Employee> findAllEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    public Employee findEmployeesByName(@PathVariable String name) {
        return employeeService.getEmployeeByName(name);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public CustomResponse deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}
