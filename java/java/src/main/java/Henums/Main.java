package Henums;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Chirs", UserRole.ADMIN);
        User mod = new User("person2", UserRole.MODERATOR);
        User guest = new User("person3", UserRole.GUEST);
    

        admin.displayDetails();
        System.out.println();
        mod.displayDetails();
        System.out.println();
        guest.displayDetails();


        StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World"); // Appends " World"
    sb.insert(5, ",");   // Inserts a comma after "Hello"
    sb.replace(0, 5, "Hi"); // Replaces "Hello" with "Hi"
    sb.reverse();        // Reverses the string
    System.out.println(sb.toString()); // Output: "dlroW ,iH"

    }
}