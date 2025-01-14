package Gtypes;

public class Pizza {
    private String type;
    private double price;

    private Pizza(String type, double price){
        this.type = type;
        this.price = price;
    }

    //factory methods
    public static Pizza createMargherita(){
        return new Pizza("margherita", 9.99);
    }

    public static Pizza createVeggie(){
        return new Pizza("veggie", 14.99);
    }

    public static Pizza createVegan(){
        return new Pizza("vegan", 19.99);
    }

    @Override
    public String toString() {
        return "Pizza [type=" + type + ", price=" + price + "]";
    }

}
