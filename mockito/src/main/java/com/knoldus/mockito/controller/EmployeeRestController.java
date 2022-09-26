package com.knoldus.mockito.controller;

import com.knoldus.mockito.entity.Employee;
import com.knoldus.mockito.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Employee rest controller.
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Gets all employees.
     *
     * @return the all employees
     */
    @GetMapping("/employee")
    public Employee getAllEmployees() {
        return employeeService.getEmployeeByName("pratibha");
    }

}
