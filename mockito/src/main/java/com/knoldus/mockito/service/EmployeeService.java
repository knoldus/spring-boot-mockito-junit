package com.knoldus.mockito.service;

import com.knoldus.mockito.entity.Employee;

/**
 * The interface Employee service.
 */

public interface EmployeeService {

    /**
     * Gets employee by name.
     *
     * @param name the name
     * @return the employee by name
     */
    public Employee getEmployeeByName(String name);

}
