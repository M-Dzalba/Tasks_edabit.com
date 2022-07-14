package Hard;
//Body Mass Index (BMI) is found by taking your weight in kilograms and dividing by the square of your height in meters.
//The BMI categories are:
//Underweight: <18.5
//Normal weight: 18.5–24.9
//Overweight: 25–29.9
//Obesity: BMI of 30 or greater
//Create a function that will accept weight and height (in kilos, pounds, meters, or inches)
// and return the BMI and the associated category. Round the BMI to nearest tenth.
//1 inch = 0.0254 meter
//1 pound = 0.453592 kilo

public class Body_Mass_Index {

    public static String BMI(String weight, String height) {
        float w=Integer.parseInt(weight.replaceAll("\\D",""));
        float h=Float.parseFloat(height.replaceAll("[^\\d.]", ""));
        if(weight.contains("p")){
            w= (float) (w*0.453592);
        }
        if(height.contains("i")){
            h= (float) (h*0.0254);
        }
        float BMI=w/(h*h);
        String result = "";
        if(BMI<18.5)
            result=String.format("%.1f",BMI)+" Underweight";
        if(BMI>=18.5&&BMI<=24.9)
            result=String.format("%.1f",BMI)+" Normal weight";
        if(BMI>=25&&BMI<=29.9)
            result=String.format("%.1f",BMI)+" Overweight";
        if(BMI>=30)
            result=String.format("%.1f",BMI)+" Obesity";
        return result;

    }

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));// "27.0 Overweight"
        System.out.println(BMI("55 kilos", "1.65 meters"));//"20.2 Normal weight"
        System.out.println(BMI("154 pounds", "2 meters"));// "17.5 Underweight"

    }
}
