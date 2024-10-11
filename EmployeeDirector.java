/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

public class EmployeeDirector {
    private EmployeeBuilder builder;

    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee constructEmployee(String id, String name, String department, String role, int workingHours, double salary) {
        return builder.setId(id)
                      .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHoursPerWeek(workingHours)
                      .setSalary(salary)
                      .build();
    }
}
