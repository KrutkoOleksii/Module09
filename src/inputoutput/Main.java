package inputoutput;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Task 01
        ReadFileTXT readFileTXT = new ReadFileTXT();
        readFileTXT.readFile("file1.txt");

        // Task 02
        WriteToJSON writeToJSON = new WriteToJSON();
        writeToJSON.createJson("file2.txt", "user.json");

        // Task 3
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.calcFrequency("words.txt");
    }
}
