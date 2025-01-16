package Zapp;

import Kexceptions.*;

public class AgeValidator {
    public static void validateAge(int age) throws ApplicationException {
        if (age < 18){
            throw new InvalidAgeException("Age must be over 18");
        }
        if (age > 150){
            throw new ApplicationException("Too old");
        }
    }
}
