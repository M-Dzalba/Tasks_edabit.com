package Hard;

import java.text.NumberFormat;

//Write a function which increments a string to create a new string.
//
//If the string ends with a number, the number should be incremented by 1.
//If the string doesn't end with a number, 1 should be added to the new string.
//If the number has leading zeros, the amount of digits should be considered.
public class String_Incrementer {
    public static String incrementString(String str) {
        StringBuilder sb_char=new StringBuilder();
        StringBuilder sb_digit=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i)))
                sb_char.append(str.charAt(i));
            else
                sb_digit.append(str.charAt(i));
        }
        if(sb_digit.length()==0)
            return str+"1";
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(sb_digit.length());
        nf.setGroupingUsed(false);
        return sb_char.append(nf.format(Long.parseLong(sb_digit.toString())+1)).toString();
    }
    public static void main(String[] args) {
        System.out.println(incrementString("foo"));// "foo1"
        System.out.println(incrementString("foobar0009"));// "foobar0010"
        System.out.println(incrementString("foo099"));// "foo100"
    }
}