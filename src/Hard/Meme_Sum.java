package Hard;

//For this challenge, forget how to add two numbers together.
public class Meme_Sum {
    public static int howManyChar(int n){
        return (int)Math.ceil(Math.log10(n + 0.5));
    }
    public static int memeSum(int a, int b) {
        int charsA=howManyChar(a);
        int charsB=howManyChar(b);
        StringBuilder strb_a= new StringBuilder(String.valueOf(a));
        StringBuilder strb_b= new StringBuilder(String.valueOf(b));
        StringBuilder sb=new StringBuilder();
        int sum;
        if(charsA==charsB){
            for(int i=0;i<strb_a.length();i++){
                sum= Integer.parseInt(String.valueOf(strb_a.charAt(i)))+Integer.parseInt(String.valueOf(strb_b.charAt(i)));
                sb.append(sum);
            }
        }else if(charsA>charsB){
            strb_b.insert(0, '0');
            for(int i=0;i<strb_a.length();i++){
                sum= Integer.parseInt(String.valueOf(strb_a.charAt(i)))+Integer.parseInt(String.valueOf(strb_b.charAt(i)));
                sb.append(sum);
            }
        }else if(charsA<charsB){
            strb_a.insert(0,'0');
            for(int i=0;i<strb_a.length();i++){
                sum= Integer.parseInt(String.valueOf(strb_a.charAt(i)))+Integer.parseInt(String.valueOf(strb_b.charAt(i)));
                sb.append(sum);
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        System.out.println(memeSum(26, 39));// 515
        // 2+3 = 5, 6+9 = 15
        // 26 + 39 = 515
        System.out.println(memeSum(122, 81));// 1103
        // 1+0 = 1, 2+8 = 10, 2+1 = 3
        // 122 + 81 = 1103
        System.out.println(memeSum(1222, 30277));// 31499
    }
}
