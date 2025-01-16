package Linheritlab1;

import java.awt.Color;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(Color colour, int x, int y, double sideA, double sideB) {
        super(colour, x, y); 
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getCircumference() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String getCharacteristics() {
        return super.getCharacteristics() + ", SideA is " + sideA + ", SideB is " + sideB +
               ", Area is " + getArea() + ", Circumference is " + getCircumference();
    }
}
