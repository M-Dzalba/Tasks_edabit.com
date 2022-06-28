package Hard;

//Create a function that returns true if two lines rhyme and false otherwise.
// For the purposes of this exercise, two lines rhyme if the last word from each sentence contains the same vowels.
public class Rhyme_Time {
    public static boolean doesRhyme(String str1, String str2) {
        String s1= String.valueOf(str1.charAt(str1.length()-3)).toLowerCase()+String.valueOf(str1.charAt(str1.length()-2)).toLowerCase();
        String s2= String.valueOf(str2.charAt(str2.length()-3)).toLowerCase()+String.valueOf(str2.charAt(str2.length()-2)).toLowerCase();
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));// true

        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));// true
// Capitalization and punctuation should not matter.

        System.out.println(doesRhyme("You are off to the races", "a splendid day."));// false

        System.out.println(doesRhyme("and frequently do?", "you gotta move."));// false
    }
}
