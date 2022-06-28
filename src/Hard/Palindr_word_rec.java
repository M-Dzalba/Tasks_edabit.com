package Hard;
//Create a recursive function that determines whether a word is a palindrome or not.
public class Palindr_word_rec {
    public static boolean isPalindrome(String wrd) {
        if(wrd.length() == 0 || wrd.length() == 1)
            return true;
        if(wrd.charAt(0) == wrd.charAt(wrd.length()-1))
         return isPalindrome(wrd.substring(1, wrd.length()-1));

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));// true

        System.out.println(isPalindrome("adieu"));// false

        System.out.println(isPalindrome("rotor"));// true
    }
}
