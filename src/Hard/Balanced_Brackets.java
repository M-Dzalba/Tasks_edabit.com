package Hard;
import java.util.Stack;
//Write a function that takes a string of brackets and checks whether they're balanced or not.
//
//The sequence is balanced if:
//
//It contains no unmatched brackets.
//The subset of brackets enclosed within the confines of a matched pair of brackets is also balanced.
public class Balanced_Brackets {
    public static boolean isBalanced(String text) {
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                    if ((stack.peek() != '(') || stack.empty()) {
                        break;
                    } else stack.pop();
                    break;
                case ']':
                    if ((stack.peek() != '[') || stack.empty()) {
                        break;
                    } else stack.pop();
                    break;
                case '}':
                    if ((stack.peek() != '{') || stack.empty()) {
                        break;
                    } else stack.pop();
                    break;
            }
        }
        return stack.empty();
    }
    public static void main (String[] args){
        System.out.println(isBalanced("{[()]}"));//true
        System.out.println(isBalanced("[()]{}"));//true
        System.out.println(isBalanced("{[([)]]}"));//false
    }
}