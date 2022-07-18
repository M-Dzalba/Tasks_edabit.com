package Hard;

//Write a function that calculates overtime and pay associated with overtime.
//
//Working 9 to 5: regular hours
//After 5pm is overtime
//Your function gets an array with 4 values:
//
//Start of working day, in decimal format, (24-hour day notation)
//End of working day. (Same format)
//Hourly rate
//Overtime multiplier
//Your function should spit out:
//
//$ + earned that day (rounded to the nearest hundreth)
/*
2nd example explained:
        From 16 to 17 is regular, so 1 * 30 = 30
        From 17 to 18 is overtime, so 1 * 30 * 1.8 = 54
        30 + 54 = $84.00*/
public class Working_9_to_5 {
    public static String overTime(double[] arr) {
        int sumHoursRegul=0;
        int sumHoursOverTime=0;
        float toPay;
        int wholePartHours = (int)arr[0];
        float fractionalPartHours = (float) (arr[0] - wholePartHours);
        if(arr[1]<=17){
            for(int i = (int) arr[0]; i<arr[1]; i++){
                sumHoursRegul++;
            }
            toPay= (float) (sumHoursRegul*arr[2])-(float)(fractionalPartHours*arr[2]) ;
        }
        else
        {
            for(int i = (int) arr[0]; i<arr[1]; i++){
                if (i<17)
                    sumHoursRegul++;
                else
                    sumHoursOverTime++;
            }
            toPay= (float) ((sumHoursRegul*arr[2])+(sumHoursOverTime*arr[2]*arr[3]))-(float)(fractionalPartHours*arr[2]) ;
        }
        return String.format("$%.2f",toPay);
    }
    public static void main(String[] args) {
        System.out.println(overTime(new double[]{9, 17, 30, 1.5}));//"$240.00"
        System.out.println(overTime(new double[]{16, 18, 30, 1.8}));//"$84.00"
        System.out.println(overTime(new double[]{13.25, 15, 30, 1.5}));//"$52.50"
    }
}