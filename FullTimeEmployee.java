/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagementSystem;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as a Full-Time employee.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out as a Full-Time employee.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking " + workingHoursPerWeek + " work hours.");
    }
}
