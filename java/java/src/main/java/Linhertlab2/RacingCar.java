package Linhertlab2;

public class RacingCar extends Car {
    private String driver;
    private int turboFactor;

    // Constructor
    public RacingCar(String model, String driver, int turboFactor) {
        super(model);
        this.driver = driver;
        this.turboFactor = turboFactor;
    }

    // Getters and Setters
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getTurboFactor() {
        return turboFactor;
    }

    public void setTurboFactor(int turboFactor) {
        this.turboFactor = turboFactor;
    }

    // Override accelerate method
    @Override
    public void accelerate(int seconds) {
        super.accelerate(seconds); // Base class acceleration
        setSpeed(getSpeed() * turboFactor); // Apply turbo factor
    }

    // Get racing car details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Driver: " + driver + ", Turbo Factor: " + turboFactor;
    }
}
