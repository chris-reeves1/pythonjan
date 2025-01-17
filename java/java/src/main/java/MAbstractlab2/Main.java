package MAbstractlab2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        int[] ages = {3, 6, 1, 5, 4, 2};
        String[] names = {"c", "d", "a", "b", "f", "e"};

        for (int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], ages[i]));
        }

        // Display people (unsorted)
        System.out.println("Unsorted:");
        displayPeople(people);

        // Sort by age (natural order)
        Collections.sort(people);
        System.out.println("\nSorted by Age:");
        displayPeople(people);

        // Sort by name using PersonNameComparer
        Collections.sort(people, new PersonComparetor());
        System.out.println("\nSorted by Name:");
        displayPeople(people);
    }

    // Method to display people
    private static void displayPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}