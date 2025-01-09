package BBasics;

public class Main {
    public static void main(String[] args) {
        
        //int a = 10; //primitive data types. Stack memory. 
        //int b = a; // copies the data. 
        //b = 15; // only updates b
        //System.out.println(a);
        //System.out.println(b);

        //String name = "alice"; // reference type. Heap memory.  

        //int[] arr = {1, 2, 3};
        //int[] ref = arr;
        //ref[0] = 100;

        //System.out.println(arr[0]);
        //System.out.println(ref[0]);

        // ++ --
        //int i = 5;
        //int result = ++i; // pre-increment
        //System.out.println(i);
        //System.out.println(result);

        //int i = 5;
        //int result = i++; // post-increment
        //System.out.println(i);
        //System.out.println(result);
    
        //for (int i = 0; i < 5; ++i){
        ///    System.out.println(i);
        //}

        //int num = 100;
        //long l = num;

        //System.out.println(l);

        //double d = 100.5;
        //int num = (int) d;

        //System.out.println(num); // truncated. 

        //String intstring = "123";
        //int number = Integer.parseInt(intstring);
        //System.out.println(number);

        //String doublestring = "45.67";
        //double decimal = Double.parseDouble(doublestring);
        //System.out.println(decimal);

        //String booleanstring = "true";
        //boolean flag = Boolean.parseBoolean(booleanstring);
        //System.out.println(flag);
    }
}




// variables
// reference type - allows for multiple references to same object. 


// stack memory:
// primitiv data types, JVC manages memory, faster, thread-safe, smaller. 
// heap:
// reference objects, manual memeory management (garbage collection does this for us though.)
// No thread safety, slow, larger. 

// Casting: 
// implicit casting also known as widening. 
// small to big. 

// Explicit also known as narrowing. Leads to data and precision loss. 

// Parsing
// strings to primitives
