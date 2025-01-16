package Linhertlab2;

import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> employees;

    // Constructor
    public Manager(String name, String jobTitle) {
        super(name, jobTitle);
        this.employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Get info
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "\nEmployees under this manager:\n";
        for (Employee emp : employees) {
            info += emp.getInfo();
        }
        return info;
    }
}