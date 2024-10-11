/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

// Factory class to create Employee instances based on type
public class EmployeeFactory {
    public static Employee createEmployee(String type, String id, String name, String department, String role, int hours, double salary) {
        if ("FullTime".equalsIgnoreCase(type)) {
            return new FullTimeEmployee(id, name, department, role, hours, salary);
        } else if ("PartTime".equalsIgnoreCase(type)) {
            return new PartTimeEmployee(id, name, department, role, hours, salary);
        }
        return null;
    }
}
