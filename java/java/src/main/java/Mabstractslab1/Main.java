package Mabstractslab1;

public class Main {
    public static void main(String[] args) {
        // Create an array of animals
        Animal[] animals = {
            new Duck("Mallard"),
            new Penguin("Emperor"),
            new Fish("Salmon")
        };

        // Process Consumable animals
        System.out.println("Processing Consumable Animals:");
        for (Animal animal : animals) {
            if (animal instanceof Consumable) {
                Consumable consumable = (Consumable) animal;
                System.out.println(consumable.describeTaste());
                System.out.println(consumable.isMainCourseDish());
            }
        }

        // Process Insurable animals
        System.out.println("\nProcessing Insurable Animals:");
        for (Animal animal : animals) {
            if (animal instanceof Insurable) {
                Insurable insurable = (Insurable) animal;
                System.out.println(insurable.getPremium());
                System.out.println(insurable.expires());
            }
        }
    }
}
