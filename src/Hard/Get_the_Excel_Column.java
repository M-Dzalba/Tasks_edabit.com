package Hard;
//Excel column names are in the following format:
//
//A, B, ..., Z, AA, ..., AZ, BA, ..., ZZ, AAA, AAB, ...
//Write a function that returns the column number from the column name.
public class Get_the_Excel_Column {
    public static int column(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++)
        {
            result *= 26;
            result += str.charAt(i) - 'A' + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(column("A"));//1

        System.out.println(column("Z")); // 26

        System.out.println(column("AA")); // 27

        System.out.println(column("BA"));// 53
    }
}
