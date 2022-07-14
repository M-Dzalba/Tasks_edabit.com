package Hard;

//The left shift operation is similar to multiplication by powers of two, thus, the process is repetitive and
// can be done recursively.
//
//Sample calculation using the left shift operator (<<):
//Write a recursive function that mimics (without the use of <<) the left shift operator and returns the result
// from the two given integers.
//There will be no negative values for the second parameter y.
//This challenge is more like recreating of the left shift operation, thus,
// the use of the operator directly is prohibited.
//You are expected to solve this challenge via recursion.


public class Recursion_Left_Shift_by_Powers_of_Two {
    public static int shiftToLeft(int x, int y) {

        if(y==0)
            return 0;
        else
            return
                    (int) (x*2*Math.pow(2,y-1));

    }
    public static void main(String[] args) {
        System.out.println(shiftToLeft(5, 2));// 20

        System.out.println(shiftToLeft(10, 3));// 80

        System.out.println(shiftToLeft(-32, 2));// -128

        System.out.println(shiftToLeft(-6, 5));// -192

        System.out.println(shiftToLeft(12, 4));// 192

        System.out.println(shiftToLeft(46, 6));// 2944
    }

}