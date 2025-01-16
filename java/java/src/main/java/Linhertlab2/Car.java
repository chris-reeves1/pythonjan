package Linhertlab2;

public class Car {
    private String model;
    private int speed;

    // Constructor
    public Car(String model) {
        this.model = model;
        this.speed = 0; // Default speed is 0
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to get to 60 MPH
    public void getToSixty() {
        this.speed = 60;
    }

    // Accelerate method
    public void accelerate(int seconds) {
        this.speed += 5 * seconds;
    }

    // Get car details
    public String getDetails() {
        return "Model: " + model + ", Speed: " + speed + " MPH";
    }
}
