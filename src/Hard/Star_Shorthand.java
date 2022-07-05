package Hard;

//Write a function that converts a string into star shorthand. If a character is repeated n times,
// convert it into character*n.
//Leave lone occurrences of a character as is.
//Return an empty string if given an empty string input.
public class Star_Shorthand {
    public static String toStarShorthand(String str) {
        char ch_temp;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        if(str.length()>1)
            ch_temp = str.charAt(0);
        else
            ch_temp=' ';
        sb.append(ch_temp);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch_temp) {
                count++;
                ch_temp = str.charAt(i);
                continue;
            }  if (count > 1) {
                sb.append("*");
                sb.append(count);
                count = 1;
            }
            sb.append(str.charAt(i));
            ch_temp = str.charAt(i);
        }if (count > 1) {
            sb.append("*");
            sb.append(count);
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(toStarShorthand("abbccc"));//"ab*2c*3"

        System.out.println(toStarShorthand("77777geff"));// "7*5gef*2"

        System.out.println(toStarShorthand("abc"));// "abc"

        System.out.println(toStarShorthand(""));//  ""
    }
}
