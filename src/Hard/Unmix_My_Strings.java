package Hard;
//lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say: Please help me unmix these strings!
//
//Somehow my strings have all become mixed up; every pair of characters has been swapped.
// Help me undo this so I can understand my strings again.
//The length of a string can be odd — in this case the last character is not altered
// (as there's nothing to swap it with).
public class Unmix_My_Strings {
    public static String unmix(String str) {
        String unmixedString="";
        char[] c=str.toCharArray();
        for(int i=0;i< c.length;i++){
            if(i%2==0&&i!= c.length-1)
                swap(c,i);
            unmixedString+=c[i];
        }
return unmixedString;
    }
    private static void swap(char[]c,int i){
        char tmp=c[i];
        c[i]=c[i+1];
        c[i+1]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(unmix("123456"));//"214365"

        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));//"This is a mixed up string."

        System.out.println(unmix("badce"));//"abcde"
    }
}
