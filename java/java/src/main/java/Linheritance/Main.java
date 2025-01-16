package Linheritance;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Substitution (upcasting)
        if (myDog instanceof Dog) {
            Dog myDog1 = (Dog) myDog; // Safe casting
            myDog1.test(); 
            myDog.speak();}
    }
}
class Animal {
    public void speak() {
        System.out.println("Animal speaks.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks.");
    }
    public void test(){
        System.out.println("output");
    }
}
