package Hard;
//Create a function that converts Celsius to Fahrenheit and vice versa.
public class Temperature_Converter {
    public static String convert(String deg) {
        int temp=Integer.parseInt(deg.substring(0,2));
        String result;
        int temp_res;
        if(deg.contains("C")){
            temp_res=temp*9/5+32;
            result=temp_res+"*F";
        }else if(deg.contains("F")){
            temp_res=(temp-32)*5/9;
            result=temp_res+"*C";
        }else
            return "Error";
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convert("35*C"));// "95*F"
        System.out.println(convert("19*F"));// "-7*C"
        System.out.println(convert("33"));// "Error"
    }
}
