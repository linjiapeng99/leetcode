package math;

import java.awt.print.PrinterGraphics;

public class No1281 {
    public static void main(String[] args) {
        int end = subtractProductAndSum(234);
        System.out.println(end);
    }
    public static int subtractProductAndSum(int n) {
        /*String nStr=n+"";
        int j=1;
        int s=0;
        for (int i = 0; i < nStr.length(); i++) {
            *//*j*= Integer.parseInt(nStr.charAt(i)+"");
            s+=Integer.parseInt(nStr.charAt(i)+"");*//*
            j*=nStr.charAt(i)-'0';
            s+=nStr.charAt(i)-'0';
        }
        return j-s;*/
        int j=1;
        int s=0;
        while (n>0){
            j*=(n%10);
            s+=(n%10);
            n=n/10;
        }
        return j-s;
    }
}
