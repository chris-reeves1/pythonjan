package Gtypes;

public class Main {
    public static void main(String[] args) {

    //person1.introduce();
    Person child = Person.createPerson("chris");
    System.out.println(child);

    Pizza veggie = Pizza.createVeggie();
    Pizza m = Pizza.createMargherita();
    System.out.println(m);
    System.out.println(veggie);
    
    
    }
}
    
    
        
    



    