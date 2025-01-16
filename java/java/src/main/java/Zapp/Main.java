package Zapp;

import Kexceptions.ApplicationException;
import Kexceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            AgeValidator.validateAge(50);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        } catch (ApplicationException e) {
            System.out.println("Caught ApplicationException: " + e.getMessage());
        }
    }
}
