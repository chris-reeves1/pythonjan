package Mabstractslab1;

public class Fish extends Animal implements Consumable {

    private String name;

    // Constructor
    public Fish(String name) {
        super(AnimalType.Fish); // Set type to Fish
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Implement Consumable methods
    @Override
    public String describeTaste() {
        return getName() + ": Savory";
    }

    @Override
    public String isMainCourseDish() {
        return getName() + ": true";
    }
}