/**
 * Created by Karan on 5/4/2016.
 */
public class Pangrams {
    public static boolean isPangram(String pan){
        int alphaInd;
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        //Iterate over input string and delete chars from sb as they appear uniquely
        for(char chr: pan.toCharArray()){
            alphaInd = sb.indexOf(String.valueOf(chr).toLowerCase());
            if(alphaInd >=0) sb.deleteCharAt(alphaInd);
        }
        //If all characters in sb have been deleted (len 0), input contains all alphabet
        if (sb.length() == 0) return true;
        else return false;
    }
}