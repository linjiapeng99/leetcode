package math;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class No2469 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("celsius=");
        double celsius=sc.nextFloat();
        double[] ans = ans(celsius);
        for (int i = 0; i < ans.length; i++) {
            if(i==0){
                System.out.print("[");
                System.out.print(ans[i]);
                System.out.print(",");
            }else {
                System.out.print(ans[i]);
                System.out.print("]");
            }
        }
    }
    public static double[] ans(double celsius ){
        double kelvin=celsius+273.15;
        BigDecimal bd1=new BigDecimal(kelvin).setScale(5, RoundingMode.HALF_UP);
        double newKelvin = bd1.doubleValue();
        System.out.println(newKelvin);
        //DecimalFormat df=new DecimalFormat("0.00000");
        //String kelvinStr=String.format("%5f",kelvin);
        //String kelvinStr=df.format(kelvin);
        //System.out.println(kelvinStr);
        double fahrenheit=celsius*1.80+32.00;
        BigDecimal bd2=new BigDecimal(fahrenheit).setScale(5, RoundingMode.HALF_UP);
        double newFahrenheit = bd2.doubleValue();
        System.out.println(newFahrenheit);

        //String fahrenheitStr=String.format("%5f",fahrenheit);
        //String fahrenheitStr=df.format(fahrenheit);
        //System.out.println(fahrenheitStr);
        double ans[]=new double[2];
        ans[0]= newKelvin;
        ans[1]= newFahrenheit;
        return ans;
    }
}
