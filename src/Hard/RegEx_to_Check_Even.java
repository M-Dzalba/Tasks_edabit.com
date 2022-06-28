package Hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Is isEven() to check if a given input is even using regular expressions.
public class RegEx_to_Check_Even {
    public static String isEven(String number) {
        String pattern = "^-?\\d*[02468]$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(number);
        String res;
        if(m.find()){
            res="Yes";
        }else
            res="No";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isEven("0")); // "Yes"
// Use Regular Expression

        System.out.println(isEven("-99"));// "No"
// Use Regular Expression
    }
}
