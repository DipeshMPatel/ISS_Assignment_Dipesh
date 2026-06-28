package a12_file_io;

import java.io.*;

public class FileIO {

    // File to read from and write to
    private static final String FILE_PATH = "src/a12_file_io/sample.txt";
    
    public static void main(String[] args) {
        writeToFile("Hello Dipesh!\nWelcome to Java File I/O. \nThis is inside sample.txt file");
        System.out.println();
        readFromFile();
    }

    // FileWriter creates the file (if it doesn't exist) and writes characters to it.
    // BufferedWriter is used to write character data efficiently.
    // Try-with-resources automatically closes the writer.
    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to file : " + e.getMessage());
        }
    }

    // FileReader reads characters from the file.
    // BufferedReader is used to read the file line by line.
    // Try-with-resources automatically closes the reader.
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while reading the file : " + e.getMessage());
        }

    }

}
