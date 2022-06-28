package Hard;
import java.util.Arrays;

//You have a pack of 5 randomly numbered cards, which can range from 0-9.
// You can win if you can produce a higher two-digit number from your cards than your opponent.
// Return true if your cards win that round.
public class Numbered_Cards {
    public static boolean winRound(int[] you, int[] opp) {
        Arrays.sort(you);
        Arrays.sort(opp);
        String sb_you = String.valueOf(you[4]+you[3]);
        String sb_opp = String.valueOf(opp[4]+opp[3]);
        int res_you=Integer.parseInt(sb_you);
        int res_opp=Integer.parseInt(sb_opp);
        return res_you>res_opp;

    }
    public static void main(String[] args) {
        System.out.println(winRound(new int[]{2, 5, 2, 6, 9},new int[] {3, 7, 3, 1, 2}));//  true
            // Your cards can make the number 96
            // Your opponent can make the number 73
            // You win the round since 96 > 73
        System.out.println(winRound(new int[]{2, 5, 2, 6, 9},new int[] {3, 7, 3, 1, 2}));//  true
        System.out.println(winRound(new int[]{1, 2, 3, 4, 5},new int[] {9, 8, 7, 6, 5}));//  false
        System.out.println(winRound(new int[]{4, 3, 4, 4, 5},new int[] {3, 2, 5, 4, 1}));//  false
    }
}
