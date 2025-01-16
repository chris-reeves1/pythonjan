package Linheritlab1;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(Color.ORANGE, 10, 20, 5, 10);
        Circle c = new Circle(Color.PINK, 15, 25, 7);
        Sphere s = new Sphere(Color.GRAY, 5, 5, 4);  
        System.out.println(r.getCharacteristics());
        System.out.println(c.getCharacteristics());
        System.out.println(s.getCharacteristics());

        
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(r);
        shapesList.add(c);
        shapesList.add(s);

        
        for (Shape shape : shapesList) {
            System.out.println("Colour: " + shape.getColour() + ", Position: " + shape.getPosition());
        }
    }
}

