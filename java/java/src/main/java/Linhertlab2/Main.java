package Linhertlab2;

public class Main {
    public static void main(String[] args) {
        // Create cars and racing cars
        Car car1 = new Car("Sedan");
        Car car2 = new Car("SUV");
        RacingCar racingCar1 = new RacingCar("Formula1", "Lewis Hamilton", 2);
        RacingCar racingCar2 = new RacingCar("NASCAR", "Dale Earnhardt", 3);

        // Add cars to an array
        Car[] cars = {car1, car2, racingCar1, racingCar2};

        // Process cars
        processCars(cars);

         // Create manager
         Manager manager = new Manager("Alice Johnson", "Manager");

         // Create employees
         Employee emp1 = new Employee("John Smith", "Clerk");
         Employee emp2 = new Employee("Jane Doe", "Accountant");
 
         // Create skilled worker
         SkilledWorker skilledWorker = new SkilledWorker("Bob Martin", "Technician");
         skilledWorker.addSkill("Welding");
         skilledWorker.addSkill("Programming");
 
         // Add employees to manager
         manager.addEmployee(emp1);
         manager.addEmployee(emp2);
         manager.addEmployee(skilledWorker);
 
         // Get manager's info
         System.out.println(manager.getInfo());
    }

    // Method to process cars
    public static void processCars(Car[] cars) {
        for (Car car : cars) {
            car.getToSixty(); // Get to 60 MPH
            car.accelerate(2); // Accelerate for 2 seconds
            System.out.println(car.getDetails());

            // Display driver name if the car is a RacingCar
            if (car instanceof RacingCar) {
                RacingCar racingCar = (RacingCar) car; // Cast to RacingCar
                System.out.println("Driver: " + racingCar.getDriver());
            }
        }
    }
}
