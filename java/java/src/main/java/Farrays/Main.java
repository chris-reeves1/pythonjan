package Farrays;

import java.util.Arrays;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
    
    int[] numbers = {10, 20, 30};
    numbers[1] = 25;
    System.out.println(numbers[1]);
    System.out.println(numbers.length);

    for (int x : numbers){System.out.println(x);}
  
    String[] words = {"Hello", "World"};
    System.out.println(words[0]);

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println(matrix[1][2]);

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
}

int[] source = {1, 2, 3};
int[] destination = new int[source.length];
for (int i = 0; i < source.length; i++) {
    destination[i] = source[i];
}

int[] copy = Arrays.copyOf(source, source.length);

int[] original = {1, 2, 3};
int[] extended = Arrays.copyOf(original, 1);

System.out.println(Arrays.toString(original));
System.out.println(Arrays.toString(extended));


int[] numbers1 = {4, 2, 7, 1};
Arrays.sort(numbers1);
System.out.println(Arrays.toString(numbers1));

}
}