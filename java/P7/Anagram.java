import java.util.ArrayList;
import java.util.List;

public class Anagram {
    private static String ang;
    public Anagram(String input){
        ang = input.toLowerCase();
    }

    public static List<String> match(List<String> AnaLst){
        //Init value that defaults to -1
        int alphaInd = -1;
        List<String> Outlst = new ArrayList<>();

        //Iterate through word list
        for(String str: AnaLst){
            StringBuilder angBld = new StringBuilder(ang);

            //Iterate through characters of word to compare to constructor input
            for(char chr: str.toCharArray()) {
                if (str.compareToIgnoreCase(ang) == 0) {
                    alphaInd = -1;
                    break;
                }
                //If the below function ever returns -1, the current str is excluded
                alphaInd = angBld.indexOf(String.valueOf(chr).toLowerCase());
                if (alphaInd >= 0) angBld.deleteCharAt((alphaInd));
                else break;
            }
            //After chr comparison loop done, if last alphaInd >= 0, add word to output list
            if (alphaInd >=0 && str.length()==ang.length()) Outlst.add(str);

        }

        return Outlst;
    }
}