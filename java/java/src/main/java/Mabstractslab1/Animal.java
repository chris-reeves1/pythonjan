package Mabstractslab1;

public abstract class Animal {
    private AnimalType animalType;

    // Constructor
    public Animal(AnimalType animalType) {
        this.animalType = animalType;
    }

    // Getter for animalType
    public AnimalType getAnimalType() {
        return animalType;
    }
}
