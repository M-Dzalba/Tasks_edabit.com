package Hard;

import java.util.ArrayList;

//This challenge involves a series that can start with any string of digits. The next term in the series is found by
// adding the digits of the previous term, appending that sum to the previous term, and then truncating the leftmost
// digits so that the number of digits in the terms is always the same.
//
//Let's start with "1234". The sum of the digits is 10. Appending gives us "123410", then truncating the left two
// digits results in "3410". The next three terms are "4108", "0813", "1312". The series becomes periodic when a term
// that previously appeared occurs again.
//Create a function whose argument is a digit string (the first term) and returns the length of the series when
// it first becomes periodic.
public class A_Periodic_Series {
    public static int periodic(String str) {
        int result = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int temp ;
        ArrayList<String> list = new ArrayList<>();
        do {
            if (sumStr(String.valueOf(sb)) == 1)
                return result;
            else {
                temp = (sumStr(String.valueOf(sb)));
                sb.append(temp);
                if (howManyChar(temp) == 2) {
                    sb.delete(0, 2);
                } else
                    sb.deleteCharAt(0);
                if (!list.contains(String.valueOf(sb)))
                    list.add(String.valueOf(sb));
                else break;
                result++;
            }
        }while (true) ;

        return result;
    }
    public static int sumStr(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
    public static int howManyChar(int n){
        return (int)Math.ceil(Math.log10(n + 0.5));
    }

    public static void main(String[] args) {
        System.out.println(periodic("1"));// 1

        System.out.println(periodic("3061"));// 7

        System.out.println(periodic("02468"));// 178

        System.out.println(periodic("314159265"));// 12210
    }
}
