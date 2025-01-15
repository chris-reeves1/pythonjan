package Jfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(new File("/home/ubuntu/example.txt").getAbsolutePath());

        FileReader fileReader = new FileReader("/home/ubuntu/example.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) !=null) {
            System.out.println(line);
        }
            bufferedReader.close();

        // write to a file

        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("This is written to ouput file");
        bufferedWriter.newLine();
        bufferedWriter.write("hello world");

        bufferedWriter.close();

        // nio (new input/output)

        Path filePath = Paths.get("/home/ubuntu/example.txt");
        
        //reading
        for (String line1 : Files.readAllLines(filePath)){
            System.out.println(line1);}

        //writing
        Files.write(Paths.get("example.txt"), "hello again!".getBytes());

        // Gson
            Person person = new Person("chirs", 10);
            Gson gson = new Gson();
            String json = gson.toJson(person);
            Files.write(Paths.get("data.json"), json.getBytes());

    }
}
class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

    




// filereader + buffered reader
        // filereader
        // - reads directly from character stream from file.
        // - reads a file as chars
        // - inefficient for larger files

        // buffered reader 
        // - wraps around another reader
        // - efficiant for large amounts of data as is buffered. 
        // - gives us commands like readline()

