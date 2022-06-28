package Hard;
//Starting from the left side of an integer, adjacent digits pair up in "battle" and the larger digit wins.
// If two digits are the same, they both lose. A lone digit automatically wins.
//
//Create a function that returns the victorious digits.
//There are no winners in a battle with equal digits (neither should be printed).
//If the length of the number is odd, the lone digit should be printed at the end of the number.




public class Digits_Battle {
    public static int battleOutcome(int num) {
        String number = String.valueOf(num);
        char[] digits1 = number.toCharArray();
        StringBuilder resS=new StringBuilder();
        int length= digits1.length;
        int result;
        if(length%2==0){
            for(int i=1;i< digits1.length;i+=2){
                if(digits1[i]>digits1[i-1])
                    resS.append(digits1[i]);
                else
                if (digits1[i]<digits1[i-1]) {
                    resS.append(digits1[i-1]);
                }
            }
        }else {
            for(int i=1;i< digits1.length;i+=2){

                if(digits1[i]>digits1[i-1]){
                    resS.append(digits1[i]);
                    }
                else
                if (digits1[i]<digits1[i-1]) {
                    resS.append(digits1[i-1]);
                }

            }resS.append(digits1[length-1]);
        }
        result=Integer.parseInt(String.valueOf(resS));


        return result;
    }
    public static void main(String[] args) {
        System.out.println(battleOutcome(32531)); //? 351
        System.out.println(battleOutcome(78925)); //? 895
        System.out.println(battleOutcome(111)); //? 1
    }

}
