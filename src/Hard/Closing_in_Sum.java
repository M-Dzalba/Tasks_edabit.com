package Hard;
//Create a function that returns the sum of the digits formed from the first and last digits,
// all the way to the center of the number.



public class Closing_in_Sum {
    public static int closingInSum(long num) {
        String str=String.valueOf(num);
        char[]digits=str.toCharArray();
        int res=0;
        String str_sum;
            for(int i=0;i< digits.length/2;i++){

                String s = digits[i] + String.valueOf(digits[digits.length - 1 - i]);
                if(digits.length>3){
                    str_sum= s;
                    res+=Integer.parseInt(str_sum);
                }else {
                    str_sum= s;
                    res+=Integer.parseInt(str_sum);
                    str_sum= (String.valueOf(digits[i+1]));
                    res+=Integer.parseInt(str_sum);
                }

            }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(closingInSum(121)); //? 13
// 11 + 2

        System.out.println(closingInSum(1039)); //? 22
// 19 + 3

        System.out.println(closingInSum(22225555)); //? 100
// 25 + 25 + 25 + 25
    }
}
