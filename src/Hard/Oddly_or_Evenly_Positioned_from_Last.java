package Hard;

import java.util.Arrays;
import java.util.Stack;

//Create a function that extracts the items from a unique array, given as parameter arr, filtered by positional parity
// (odd or even), given as parameter par. Return an array of items on odd positions (... 5, 3, 1) and on even positions
// (... 6, 4, 2) starting from the last item in the array.
public class Oddly_or_Evenly_Positioned_from_Last {
    public static Object[] charAtPos(Object[] arr, String par) {
        Stack<Object>stack=new Stack<>();
        int j = 0;
        if(par.equals("even")){
            for(int i= arr.length-2;i>0;i-=2){
                stack.push(arr[i]);
                j++;
            }
        }else {
            for (int i = arr.length-1; i > 0; i -= 2) {
                stack.push(arr[i]);
                j++;
            }
        }
        Object[]res = new Object[j];
        j=0;
        while (!stack.empty()) {
            res[j] = stack.pop();
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(charAtPos(new Object[]{2, 4, 6, 8, 10}, "even")));//  [4, 8]
// 4 & 8 occupy the 4th & 2nd positions from right.

        System.out.println(Arrays.toString(charAtPos(new Object[]{'E', 'D', 'A', 'B', 'I', 'T'}, "odd")));
        // ['D', 'B', 'T']
// D, B and T occupy the 5th, 3rd and 1st positions from right.

        System.out.println(Arrays.toString(charAtPos(new Object[]{")", "(", "*", "&", "^", "%", "$", "#", "@", "!"},
                "odd")));
        // ["(", "&", "%", "#", "!"]
    }
}
