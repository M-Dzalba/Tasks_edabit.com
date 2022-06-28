package Hard;

//Create a function that takes a number and returns its multiplicative persistence,
// which is the number of times you must multiply the digits in num until you reach a single digit.
public class Persistent_Little_Bugger {
    public static int bugger(int num) {
        int m = 1, r = num;

        if (r / 10 == 0)
            return 0;

        for (r = num; r != 0; r /= 10)
            m *= r % 10;

        return bugger(m) + 1;
    }
    public static void main(String[] args) {
        System.out.println(bugger(39));//3
// Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.

        System.out.println(bugger(999));// 4
// Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 = 2.

        System.out.println(bugger(4));// 0
// Because 4 is already a one-digit number.
    }
}
