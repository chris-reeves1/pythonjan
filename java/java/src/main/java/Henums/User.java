package Henums;

public class User {
    private UserRole role;
    private String name;

    public User(String name, UserRole role) {
        this.role = role;
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void displayDetails(){
        System.out.println("username: " + name);
        System.out.println("Role: " + role);
        System.out.println("permissions: " + role.getPermissions());
    }
}
