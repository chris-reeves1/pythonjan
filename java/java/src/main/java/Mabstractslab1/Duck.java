package Mabstractslab1;

public class Duck extends Bird implements Consumable, Insurable {

    // Constructor
    public Duck(String name) {
        super(name); // Set the name via superclass constructor
    }

    // Implement Consumable methods
    @Override
    public String describeTaste() {
        return getName() + ": Delicate";
    }

    @Override
    public String isMainCourseDish() {
        return getName() + ": true";
    }

    // Implement Insurable methods
    @Override
    public String getPremium() {
        return getName() + ": Premium is $50";
    }

    @Override
    public String expires() {
        return getName() + ": Insurance expires in 1 year";
    }
}
