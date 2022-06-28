package Hard;

//Create a function that takes a string of words and returns the highest scoring word.
// Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3, etc.
//If two words score the same, return the word that appears first in the original string.
//The returned string should only contain alphabetic characters (a-z).
public class WordRank_Scoring_System {
    public static String word_rank(String str) {
        String[] split_str=str.split(" ");
        char letter;
        int sum_letters=0;
        int max_numb=0;
        int index_max=0;
        for(int i=0;i<split_str.length;i++){
            for(int j=0; j < split_str[i].length(); j++){
                letter = split_str[i].charAt(j);
                if(letter>='A' && letter<='Z')
                    sum_letters+=((int)letter - 'A'+1);
                if(letter>='a' && letter<= 'z')
                    sum_letters+=((int)letter - 'a'+1);
                if(sum_letters>max_numb){
                    max_numb=sum_letters;
                    index_max=i;
                }
            }sum_letters=0;
        }
        return split_str[index_max];

    }
    public static void main(String[] args) {
        System.out.println(word_rank("The quick brown fox."));// "brown"
        System.out.println(word_rank("Nancy is very pretty."));//  "pretty"
        System.out.println(word_rank("Check back tomorrow, man!"));// "tomorrow"
        System.out.println(word_rank("Wednesday is hump day."));// "Wednesday"
    }
}
