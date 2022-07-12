package Hard;

import java.util.ArrayList;
import java.util.Arrays;
//Write a function that returns an array of strings populated from the slices of n-length characters of the given
// word (a slice after another while n-length applies onto the word).

public class N_Length_Letter_Groups {
    public static String[] collect(String s, int n) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<s.length();i+=n){
            if(i+n<=s.length())
            arr.add(s.substring(i,i+n));            
        }
        return arr.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(collect("intercontinentalisationalism", 6)));
                    //["ationa", "interc", "ntalis", "ontine"]
        System.out.println(Arrays.toString(collect("strengths", 3)));
                    // ["eng", "str", "ths"]
        System.out.println(Arrays.toString(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)));
                    // ["croscopicsilico", "pneumonoultrami", "volcanoconiosis"]
    }
}
