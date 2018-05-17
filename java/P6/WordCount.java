import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> phrase(String word){
        Map<String, Integer> wordcount = new HashMap<>();

        //Replace non-word characters in str w/ 1 space to split into array
        word = word.replaceAll("\\W+", " ").toLowerCase();
        String wordArr[] = word.split("\\s+");

        //For str in array, check hashmap for it and increment count if present
        for (String item :wordArr){
            if (wordcount.containsKey(item)) wordcount.put(item, wordcount.get(item)+1);
            else wordcount.put(item, 1);
        }
        return wordcount;
    }
}