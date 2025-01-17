package Mabstractslab1;

public class Penguin extends Bird implements Insurable {

    // Constructor
    public Penguin(String name) {
        super(name); // Set the name via superclass constructor
    }

    // Implement Insurable methods
    @Override
    public String getPremium() {
        return getName() + ": Premium is $80";
    }

    @Override
    public String expires() {
        return getName() + ": Insurance expires in 6 months";
    }
}