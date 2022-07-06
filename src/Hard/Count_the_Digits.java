package Hard;

public class Count_the_Digits {
    public static int digitsCount(long n) {
        return (n==0)?1: (int) Math.ceil(Math.log10(n + 0.5));

    }
    public static void main(String[] args) {
        System.out.println(digitsCount(4666));// 4

        System.out.println(digitsCount(544));// 3

        System.out.println(digitsCount(121317));// 6

        System.out.println(digitsCount(0));// 1

        System.out.println(digitsCount(12345));// 5

        System.out.println(digitsCount(1289396387328L));// 13
    }
}
