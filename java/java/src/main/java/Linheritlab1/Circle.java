package Linheritlab1;

import java.awt.Color;

public class Circle extends Shape {
    private double radius;

    public Circle(Color colour, int x, int y, double radius) {
        super(colour, x, y); 
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getCharacteristics() {
        return super.getCharacteristics() + ", Radius is " + radius +
               ", Area is " + getArea() + ", Circumference is " + getCircumference();
    }
}

