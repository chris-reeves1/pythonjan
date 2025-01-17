package MAbstracts;

public interface Animal {
    void eat(); // Abstract method (must be implemented)

    default void sleep() { // Default method (optional to implement)
        System.out.println("This animal is sleeping.");
    }
}

