package Mabstractslab1;

public abstract class Bird extends Animal {
    private String name;

    // Constructor
    public Bird(String name) {
        super(AnimalType.Bird); // Set type to Bird
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}