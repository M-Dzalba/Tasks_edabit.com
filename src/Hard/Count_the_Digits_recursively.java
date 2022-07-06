package Hard;

//Create a function that will recursively count the number of digits of a number. Conversion of the number to a string
// is not allowed, thus, the approach is recursive.
public class Count_the_Digits_recursively {
    public static int digitsCount(long n) {
        if (n/10!= 0)
            return 1+digitsCount(n/10);
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(digitsCount(4666));// 4

        System.out.println(digitsCount(544));//  3

        System.out.println(digitsCount(121317));//  6

        System.out.println(digitsCount(0));//  1

        System.out.println(digitsCount(12345));//  5

        System.out.println(digitsCount(1289396387328L));//  13
    }
}