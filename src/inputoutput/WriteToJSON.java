package inputoutput;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteToJSON {

    public void createJson(String fileSource, String fileDestination) throws IOException {
        System.out.println(" - - TASK #2 - -");
        List<String> file2 = Files.readAllLines(Paths.get(fileSource));
        User<String, Integer>[] users = new User[(file2.size()-1)];
            for (int i=1; i<file2.size(); i++){
            User user = new User(file2.get(i).split(" ")[0], Integer.parseInt(file2.get(i).split(" ")[1]));
            users[i-1] = user;
        }
        Gson gson = new Gson();
        String strUsers = gson.toJson(users);
            System.out.println(strUsers);
            try (
        FileWriter fileJson = new FileWriter(fileDestination)){
            fileJson.write(strUsers);
        }
        System.out.println("\n");
    }
}
