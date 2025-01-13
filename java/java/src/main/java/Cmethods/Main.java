package Cmethods;

public class Main {
    public static void main(String[] args) {

        // %d numbers
        // %s strings
        // %f float
        // %b boolean

        //System.out.printf("integer: %d%nString: %s%nfloat: %f%n", 10, "hello-world", 3.11455);
        
        // formated string

        String name = "chirs";
        int age = 10;
        double x = 25.24;

        String formattedString = String.format("hello %s, your age is %d, also %.2f", name, age, x); 
        System.out.println(formattedString);
}
}


// method - function - perform a task or return a value - like python. 
// Must be in the body of a class. 
// signature -
// define visability:
// - public: acessible anywhere
// - protected: available inside the package and sub-classes
// - private: within the class itself. 
// - default: package only. 
// static? - used by the class itself. 
// Return types:
// - void (No return values)
// - Value (String, int... )
// Name. 
// Params. 
// Making an object:
// ClassName object = new ClassName();
/*
 * Main a = new Main();
        System.out.println(a.add(5,5));    
    
    }
        
        public int add(int a, int b){
            return a + b;
        }
 * 
 * // method overloading
        // achieved by changing the number of params
        // or the order ot type of params. 
        Main c = new Main();
        c.greet();
        
                }
        
        public void greet(String name){
            System.out.println("hello " + name);
        }

        public void greet(){
            greet("Chris");
        }
 * 
 * 
 * 
 * 
 * Scanner -
 * We must make an object of the scanner class. 
 * import for utils.scanners
 * 
 * next()  reads a single word (strings)
 * nextline() reads a whole line (strings)
 * nextint() reads an integer
 * nextDouble() - reads a decimal number
 * 
 * Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); 

        System.out.println("hello " + name);
        scanner.close();
 * 
 * newline char is left over from ints or doubles needs to 
 * be consumed with nextline() before we ask for our next string. 
 * 
 * 
 * Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your age");
       int age = scanner.nextInt();

       System.out.println("enter your height");
       double height = scanner.nextDouble();

       scanner.nextLine(); 

       System.out.println("enter your name");
       String name = scanner.nextLine();

       System.out.println("hello " + name + " age is " + age + " height is " + height);
       scanner.close();
 * 
 * 
 *  // %d numbers
        // %s strings
        // %f float
        // %b boolean

        //System.out.printf("integer: %d%nString: %s%nfloat: %f%n", 10, "hello-world", 3.11455);
        
        // formated string

        String name = "chirs";
        int age = 10;
        double x = 25.24;

        String formattedString = String.format("hello %s, your age is %d, also %.2f", name, age, x); 
        System.out.println(formattedString);
}
 * 
 */