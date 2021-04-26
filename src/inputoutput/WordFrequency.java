package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

    public void calcFrequency(String fileName) throws IOException {
        System.out.println(" - - TASK #3 - -");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (int i=0; i< lines.size(); i++){
            String[] words = lines.get(i).split(" ");
            for (String word: words) {
                Integer integer = map.get(word);
                if(integer == null) {
                    map.put(word, 1);
                }
                else if(integer > 0){
                    map.put(word, integer+1);
                }
            }
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(map);
    }
}
