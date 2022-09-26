package com.knoldus.mockito.repository;

import com.knoldus.mockito.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Employee repository.
 */
@Repository


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**
     * Find by name employee.
     *
     * @param name the name
     * @return the employee
     */
    public Employee findByName(String name);

}
