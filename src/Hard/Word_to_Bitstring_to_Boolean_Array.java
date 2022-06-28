package Hard;
import java.util.Arrays;
//Create two functions that convert a word to a bitstring and then to a boolean array based on the following criteria:
//
//Locate the position of the letter in the English alphabet (from 1 to 26).
//Odd positions will be represented as 1 and even positions will be represented as 0.
//Convert the represented positions to boolean values, 1 for true and 0 for false.
//Store the conversions into an array.
//The letter A is at position 1 and Z at 26.
//All input strings are in lowercase letters of the English alphabet.
public class Word_to_Bitstring_to_Boolean_Array {
    public static Boolean[] toBoolArray(String bits) {

        Boolean[]boo=new Boolean[bits.length()];
        for(int i=0;i< boo.length;i++){
            boo[i]= bits.charAt(i) == '1';
        }
        return boo;
    }

    public static String toBitString(String word) {
        StringBuilder str_b=new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) - 'a' + 1) % 2 == 0) {
                str_b.append(0);
            } else str_b.append(1);
        }
        return String.valueOf(str_b);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toBoolArray(toBitString("deep"))));//[false, true, true, false]
// deep converts to 0110
// d is the 4th alphabet - 0
// e is the 5th alphabet - 1
// e is the 5th alphabet - 1
// p is the 16th alphabet - 0
        System.out.println(Arrays.toString(toBoolArray(toBitString("loves"))));//[false, true, false, true, true]

        System.out.println(Arrays.toString(toBoolArray(toBitString("tesh"))));//[false, true, true, false]
    }
}
