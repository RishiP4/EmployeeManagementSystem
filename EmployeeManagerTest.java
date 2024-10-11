/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ManagementSystem.Employee;
import ManagementSystem.EmployeeManager;
import ManagementSystem.EmployeeFactory;
import ManagementSystem.FullTimeEmployee;
import ManagementSystem.EmployeeBuilder;
import ManagementSystem.FullTimeEmployeeBuilder;
import ManagementSystem.EmployeeDirector;
import ManagementSystem.PartTimeEmployee;

class EmployeeManagerTest {
    @Test
    public void testSingletonBehavior() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();
        assertSame(manager1, manager2, "Both instances should be the same.");
    }

    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee emp = new FullTimeEmployee("001", "John Doe", "Engineering", "Developer", 40, 80000);
        manager.addEmployee(emp);
        assertEquals(1, manager.getAllEmployees().size(), "There should be one employee added.");
    }
}

class EmployeeDirectorTest {
    @Test
    public void testConstructEmployee() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee emp = director.constructEmployee("001", "John Doe", "Engineering", "Developer", 40, 80000);
        assertEquals("John Doe", emp.getName(), "Employee name should be 'John Doe'.");
    }
}

class EmployeeFactoryTest {
    @Test
    public void testCreateFullTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("FullTime", "001", "John Doe", "Engineering", "Developer", 40, 80000);
        assertTrue(emp instanceof FullTimeEmployee, "The created employee should be a FullTimeEmployee.");
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("PartTime", "002", "Jane Smith", "HR", "Recruiter", 20, 30000);
        assertTrue(emp instanceof PartTimeEmployee, "The created employee should be a PartTimeEmployee.");
    }
}

