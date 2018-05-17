import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
      Map<String, Integer> news = new HashMap<>();
      for(Map.Entry<Integer, List<String>> entry : old.entrySet()){
         List<String> keyList = entry.getValue();
         //Inserting key,values into new HashMap in opposite order from old
         for(String lstKey: keyList){
             news.put(lstKey.toLowerCase(), entry.getKey());
         }
      }
      return news;
   }
}