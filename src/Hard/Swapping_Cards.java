package Hard;

//Two players draw a pair of numbered cards so that both players can form a 2 digit number. A winner can be decided if
// one player's number is larger than the other.
//
//However, there is a rule where a player can swap any one of their cards with any one of the other player's cards in
// a gamble to get a higher number! Note that it is illegal to swap the order of your own cards. That means if you
// draw a 1 then a 9, you cannot swap them to get 91.
//Paul's strategy is to always swap his lowest number with the opponent's ten's digit.
// Return whether this results in Paul winning the round.
//If both of Paul's digits are the same, swap the ten's digit with the opponent's (paul likes to live riskily).
//The cards don't include the number 0.

public class Swapping_Cards {
    public static boolean swapCards(int x, int y) {
        long x_firstDigit=x/10;
        long x_secondDigit=x%10;
        long y_firstDigit=y/10;
        long y_secondDigit=y%10;
        StringBuilder firstSwapNumb=new StringBuilder();
        StringBuilder secondSwapNumb=new StringBuilder();
        if(x_firstDigit>x_secondDigit){
            firstSwapNumb.append(x_firstDigit);
            firstSwapNumb.append(y_firstDigit);
            secondSwapNumb.append(x_secondDigit);
            secondSwapNumb.append(y_secondDigit);
        }else if(x_firstDigit<x_secondDigit) {
            firstSwapNumb.append(y_firstDigit);
            firstSwapNumb.append(x_secondDigit);
            secondSwapNumb.append(x_firstDigit);
            secondSwapNumb.append(y_secondDigit);
        }else {
            firstSwapNumb.append(y_firstDigit);
            firstSwapNumb.append(x_secondDigit);
            secondSwapNumb.append(x_firstDigit);
            secondSwapNumb.append(y_secondDigit);
        }

        return Long.parseLong(firstSwapNumb.toString())>Long.parseLong(secondSwapNumb.toString());
    }
    public static void main(String[] args) {
        System.out.println(swapCards(41, 98));// true

        System.out.println(swapCards(12, 28));// true

        System.out.println(swapCards(67, 53));// false

        System.out.println(swapCards(77, 54));// false

    }
}
