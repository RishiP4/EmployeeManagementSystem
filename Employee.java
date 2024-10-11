/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

// Abstract Employee class
public abstract class Employee {
    protected String id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();

    // Getters and setters for properties
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getRole() { return role; }
    public int getWorkingHoursPerWeek() { return workingHoursPerWeek; }
    public double getSalary() { return salary; }
}

