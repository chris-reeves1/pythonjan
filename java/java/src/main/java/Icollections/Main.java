package Icollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      HashMap<String, Integer> map = new HashMap<>();

       // Adding key-value pairs
       map.put("Alice", 30);
       map.put("Bob", 25);
       map.put("Charlie", 35);

       System.out.println(map);

       map.put("David", 40); // Add a new key-value pair
       map.put("Alice", 32); // Update value for key "Alice"
       System.out.println(map); // Output: {Alice=32, Bob=25, Charlie=35, David=40}
   
       map.putIfAbsent("Eve", 28); // Add only if key doesn't exist
       System.out.println(map);

       System.out.println(map.get("Alice")); // Output: 32
        System.out.println(map.get("Frank")); // Output: null

        System.out.println(map.getOrDefault("Frank", 0));

        // Iterating over keys
    for (String key : map.keySet()) {
        System.out.println("Key: " + key);
    }

    // Iterating over values
    for (Integer value : map.values()) {
        System.out.println("Value: " + value);
    }

    // Iterating over key-value pairs
    for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    }
}
