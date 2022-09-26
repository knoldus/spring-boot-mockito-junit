package com.knoldus.mockito.repository;

import com.knoldus.mockito.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * The type Employee repository integration test.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * When find by name then return employee.
     */
    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        String name = "pratibha";
        Employee employee = new Employee();
        employee.setName(name);
        entityManager.persist(employee);
        entityManager.flush();

        // when
        Employee found = employeeRepository.findByName(employee.getName());

        // then
        Assert.assertNotNull(found);
        Assert.assertEquals(found.getName(),name);

    }

}