package Hard;
import java.util.Stack;
//Create a function that reverses letters in a string but keeps digits in their current order.
public class Reverse_Letters_Keep_Numbers_in_Place {
    public static String reverse(String str) {
        Stack<Character> letters = new Stack();
        for (char c: str.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        System.out.println(reverse("ab89c"));// "cb89a"

        System.out.println(reverse("jkl5mn923o"));//  "onm5lk923j"

        System.out.println(reverse("123a45"));// "123a45"
    }
}
