package Hard;

//An ice cream sandwich is a string that is formed by two identical ends and a different middle.
//Notice how left and right ends of the sandwich are identical in both length and in repeating character.
//The middle section is distinctly different.
//Write a function that returns true if a string is an ice cream sandwich and false otherwise.
//An ice cream sandwich must have a minimum length of 3 characters, and at least two of these characters must
// be distinct (you can't only have the filling!).
public class Ice_Cream_Sandwich {
    public static boolean isIcecreamSandwich(String str) {
        StringBuilder sb=new StringBuilder();
        if(str.length()<3)
            return false;
        char ch_0= str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==ch_0){
                sb.append(str.charAt(i));
            }else
                break;
        }
        return str.endsWith(sb.toString());
    }
    public static void main(String[] args) {
        System.out.println(isIcecreamSandwich("CDC"));// true
        System.out.println(isIcecreamSandwich("AAABB"));// false
        System.out.println(isIcecreamSandwich("AA"));// false
        System.out.println(isIcecreamSandwich("hhhhhhhhmhhhhhhhh"));// true
        System.out.println(isIcecreamSandwich("3&&3"));// true
    }
}