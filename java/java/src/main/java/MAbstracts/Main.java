package MAbstracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sort the students (uses compareTo)
        Collections.sort(students);

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student.getId() + ": " + student.getName());
        }
    }
}
    


    class Student implements Comparable<Student> {
        private int id;
        private String name;
    
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    
        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.id, other.id); // Compare by ID
        }
    
        // Getters for id and name (optional)
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    }
    