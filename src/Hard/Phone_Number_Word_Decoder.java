package Hard;

//Create a program that converts a phone number with letters to one with only numbers.
//
//Number	Letter
//0	none
//1	none
//2	ABC
//3	DEF
//4	GHI
//5	JKL
//6	MNO
//7	PQRS
//8	TUV
//9	WXYZ
//All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or
// (XXX)XXX-XXXX, using numbers and capital letters.
public class Phone_Number_Word_Decoder {
    public static String textToNum(String phone) {
        StringBuilder numbDigit = new StringBuilder();
        for (char c:phone.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                numbDigit.append(getKeypadNumber(c));
            else
                numbDigit.append(c);
        }
        return numbDigit.toString();
    }
    public static char getKeypadNumber(char characterToConvert) {
        if (Character.isDigit(characterToConvert))
            return characterToConvert;
        else {
            switch (characterToConvert) {
                case 'A' : case 'B' : case 'C' : return '2';
                case 'D' : case 'E' : case 'F' : return '3';
                case 'G' : case 'H' : case 'I' : return '4';
                case 'J' : case 'K' : case 'L' : return '5';
                case 'M' : case 'N' : case 'O' : return '6';
                case 'P' : case 'Q' : case 'R' : case 'S' : return '7';
                case 'T' : case 'U' : case 'V' : return '8';
                case 'W' : case 'X' : case 'Y' : case 'Z' : return '9';
                default: return '*';
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(textToNum("123-647-EYES"));// "123-647-3937"

        System.out.println(textToNum("(325)444-TEST"));// "(325)444-8378"

        System.out.println(textToNum("653-TRY-THIS"));// "653-879-8447"

        System.out.println(textToNum("435-224-7613"));// "435-224-7613"
    }

}
