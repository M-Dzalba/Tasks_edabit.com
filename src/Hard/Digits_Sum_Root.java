package Hard;

public class Digits_Sum_Root {
    public static int digitRoot(long n) {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        if(sum<=9) return sum;
        else
            return digitRoot (sum);
    }

    public static void main(String[] args) {
        System.out.println(digitRoot(123));// 6
            // 1 + 2 + 3 = 6

        System.out.println(digitRoot(999888777L));// 9

        System.out.println(digitRoot(1238763636555555555L));// 9
    }
}
