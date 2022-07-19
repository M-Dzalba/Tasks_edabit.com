package Hard;

//Create a function that takes two integers and returns true if a digit repeats three times in a row at any place
// in num1 AND that same digit repeats two times in a row in num2.
public class Triple_Double_So_Much_Trouble {
    static boolean trouble(long numb1, long numb2){
        int[] numb1_arr = new int[10];
        int[] numb2_arr = new int[10];
        int numbTriple=0;
        while (numb1 > 0){
            int rem = (int) (numb1 % 10);
            numb1_arr[rem]++;
            numb1 = numb1 / 10;
        }
        while (numb2 > 0){
            int rem = (int) (numb2 % 10);
            numb2_arr[rem]++;
            numb2 = numb2 / 10;
        }
        for (int i = 0; i < 10; i++){
            if (numb1_arr[i] == 3)
                numbTriple=i;
        }
        return numb2_arr[numbTriple] == 2;
    }

    public static void main(String[] args) {
        System.out.println(trouble(451999277, 41177722899L));// True
        System.out.println(trouble(1222345, 12345));// False
        System.out.println(trouble(666789L, 12345667L));// True
        System.out.println(trouble(33789, 12345337));// False
    }
}