package Linheritlab1;

import java.awt.Color;
import java.awt.Point;

public class Shape {
    public Color colour;
    private Point position; 

    public Shape(Color colour, int x, int y) {
        this.colour = colour;
        this.position = new Point(x, y); 
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public String getCharacteristics() {
        return "Colour is " + colour + ", Position is " + position;
    }
}
