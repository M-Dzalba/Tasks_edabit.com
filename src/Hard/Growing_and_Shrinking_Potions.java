package Hard;
//There are two types of potions:
//
//Growing potion: "A"
//Shrinking potion: "B"
//If "A" immediately follows a digit, add 1 to the digit.
//If "B" immediately follows a digit, subtract 1 from the digit.
//Create a function that returns a string according to these rules, removing the potions once they've been consumed.


public class Growing_and_Shrinking_Potions {
    public static String afterPotion(String str) {
        int []res=new int [str.length()];
        int a=str.indexOf('A');
        int b=str.indexOf('B');
        for(int i=0;i< res.length;i++) {
            if (!Character.isLetter(str.charAt(i)))
                res[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            else
            {
                if (str.charAt(i)=='A') {
                    res[a - 1]++;
            }
                if (str.charAt(i)=='B') {
                    res[b - 1]--;
                }
            }
        }
        StringBuilder str_b= new StringBuilder();
        for (int re : res) {
            if (!(re == 0))
                str_b.append(re);
        }

        return str_b.toString();
    }
    public static void main(String[] args) {
        System.out.println(afterPotion("3A78B51"));//  "47751"
// 3 grows to 4, 8 shrinks to 7

        System.out.println(afterPotion("9999B"));//  "9998"

        System.out.println(afterPotion("9A123"));//  "10123"

        System.out.println(afterPotion("567"));//  "567"

    }
}
