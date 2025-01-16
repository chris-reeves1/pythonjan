package Linhertlab2;

public class Employee {
    private String name;
    private String jobTitle;
    private int id;
    protected static int idCount;

    // Constructor
    public Employee(String name, String jobTitle) {
        setId(++Employee.idCount * 10);
        setName(name);
        setJobTitle(jobTitle);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }

    
    private void setName(String name) {
        this.name = name;
    }

    private void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    private void setId(int id) {
        this.id = id;
    }

    // Get information about the employee
    public String getInfo() {
        String info = "\n**** *****\n";
        info += "Name: " + getName() + "\n";
        info += "Job Title: " + getJobTitle() + "\n";
        info += "Employee ID: " + getId() + "\n";
        return info;
    }
}