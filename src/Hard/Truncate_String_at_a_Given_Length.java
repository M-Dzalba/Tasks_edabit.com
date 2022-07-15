package Hard;

//Create a function that takes a string (the string to truncate) and a number (the maximum length of
// the truncated string) as arguments and returns the truncated string at the given length.
//To "truncate" means "to shorten by cutting off the top or end".
//If a word is truncated in the middle, discard it in the output (see 2nd example above).
public class Truncate_String_at_a_Given_Length {
    public static String truncate(String str, int length) {
        String temp;
        int ind;
        if(str.charAt(length)!=' '){
            temp=str.substring(0,length+1);
            ind=temp.lastIndexOf(' ');
            return str.substring(0,ind);
        }
        else
            return str.substring(0,length);
    }
    public static void main(String[] args) {
        System.out.println(truncate("Lorem ipsum dolor sit amet.", 11));// "Lorem ipsum"
        System.out.println(truncate("Lorem ipsum dolor sit amet.", 16));// "Lorem ipsum"
        System.out.println(truncate("Lorem ipsum dolor sit amet.", 17));// "Lorem ipsum dolor"
    }
}