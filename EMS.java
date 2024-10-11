/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

public class EMS {
    public static void main(String[] args) {
        // Singleton EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();

        // Using Builder pattern to create a full-time employee
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        Employee fullTimeEmployee = director.constructEmployee("001", "John Doe", "Engineering", "Developer", 40, 80000);
        manager.addEmployee(fullTimeEmployee);

        // Using Factory pattern to create a part-time employee
        Employee partTimeEmployee = EmployeeFactory.createEmployee("PartTime", "002", "Jane Smith", "HR", "Recruiter", 20, 30000);
        manager.addEmployee(partTimeEmployee);

        // Display all employees
        for (Employee emp : manager.getAllEmployees()) {
            System.out.println("Employee ID: " + emp.getId() + ", Name: " + emp.getName() + ", Department: " + emp.getDepartment());
            emp.clockIn();
            emp.trackWorkHours();
            emp.clockOut();
        }
    }
}

