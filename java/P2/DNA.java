import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DNA {

    private String DNAStr;
    private List<Character> bases = Arrays.asList('A', 'C', 'G', 'T');
    DNA(String dna){
        DNAStr = dna;
    }

    public int count(char nTide){
        //If Base is not a proper nucleotide, throw exception
        if(!bases.contains(nTide)) throw new IllegalArgumentException();
        int counter = 0;
        //Count occurrences of nucleotide in DNA string
        for(int i=0; i<DNAStr.length(); i++){
            if (DNAStr.charAt(i) == nTide){
                counter++;
            }
        }
        return counter;
    }

    public HashMap<Character, Integer> nucleotideCounts(){
        //Create empty hashmap and iterate through base list, inserting nuc counts
        HashMap<Character, Integer> nucArr = new HashMap<>();
        for(char Base : bases){
            nucArr.put(Base, count(Base));
        }
        return nucArr;
    }

}