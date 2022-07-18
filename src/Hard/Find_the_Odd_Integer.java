package Hard;

import java.util.HashMap;
//Create a function that takes an array and finds the integer which appears an odd number of times.
public class Find_the_Odd_Integer {
    public static int findOdd(int[] arr) {
        HashMap<Integer,Integer> h_map = new HashMap<>();
        for (int j : arr) {
            if (h_map.containsKey(j)) {
                int val = h_map.get(j);
                h_map.put(j, val + 1);
            } else
                h_map.put(j, 1);
        }
        for(Integer a:h_map.keySet())
        {
            if(h_map.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));// -1
        System.out.println(findOdd(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));// 5
        System.out.println(findOdd(new int[]{10}));// 10
    }
}
