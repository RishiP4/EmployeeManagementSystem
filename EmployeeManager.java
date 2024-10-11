/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Singleton class EmployeeManager
public class EmployeeManager {
    private static EmployeeManager instance = null;
    private List<Employee> employees;

    // Private constructor to prevent instantiation
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Public method to provide the Singleton instance
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee
    public void removeEmployee(String id) {
        employees.removeIf(emp -> emp.getId().equals(id));
    }

    // Method to retrieve all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Method to retrieve a specific employee by ID
    public Employee getEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}

