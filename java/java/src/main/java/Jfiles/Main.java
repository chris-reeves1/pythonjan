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
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] courses = readCSV(coursePath);
        String[] trainers = readCSV(trainerPath);
        
        FileWriter fileWriter = new FileWriter("trainersAndCourses.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Courses:");
        bufferedWriter.newLine();

        for(String line : courses){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.newLine();
        bufferedWriter.write("Trainers:");
        bufferedWriter.newLine();
        for(String line : trainers){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        JsonObject json = new JsonObject();
        Path filePath = Paths.get("trainerCourse.txt");
        
        for(String line1 : Files.readAllLines(filePath)){
            String[] pair = line1.split(",");
            int trainerIndex = Integer.parseInt(pair[0]) - 1;
            int courseIndex = Integer.parseInt(pair[1]) - 1;

            json.addProperty(trainers[trainerIndex], courses[courseIndex]);
            Gson gson = new Gson();
            String jsonString = gson.toJson(json); // Convert JsonObject to a JSON string

        // Write the JSON string to a file
        Files.write(Paths.get("data.json"), jsonString.getBytes());

        }
        //Files.write(Paths.get("data.json"), json.toString().getBytes());
    }

    

    public static String coursePath = "course.txt";
    public static String trainerPath = "trainer.txt";
    public static String trainerCoursePath = "trainerCourse.txt";

    private static String[] readCSV(String inFile) throws IOException{
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String content = bufferedReader.readLine();
        bufferedReader.close();

        return content.split(",");

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

