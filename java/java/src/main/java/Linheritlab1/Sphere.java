package Linheritlab1;

import java.awt.Color;

public class Sphere extends Circle {

    public Sphere(Color colour, int x, int y, double radius) {
        super(colour, x, y, radius); 
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public String getCharacteristics() {
        return super.getCharacteristics() + ", Volume is " + getVolume();
    }
}
