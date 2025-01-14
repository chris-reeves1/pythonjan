package Gtypes;

public class Person {
    private String name;
    private int age;
    // Methods (behavior of the object)
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old."); 
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // factory method
    public static Person createPerson(String name){
        return new Person(name, 10);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    

    
}





    


