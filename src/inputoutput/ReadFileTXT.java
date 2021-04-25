package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFileTXT {

    public void readFile(String fileName) throws IOException {
        System.out.println(" - - TASK #1 - -");
        List<String> file = Files.readAllLines(Paths.get(fileName));
        for (String number:file){
            if (isValid(number)){
                System.out.println(number);
            }
        }
        System.out.println("\n");
    }

    private static boolean isValid(String number) {
        String pattern1 = "\\(\\d\\d\\d\\) \\d\\d\\d-\\d\\d\\d\\d";
        String pattern2 = "\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d";
        return Pattern.compile(pattern1).matcher(number).find() || Pattern.compile(pattern2).matcher(number).find();
    }

}
