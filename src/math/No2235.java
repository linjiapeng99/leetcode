package math;

import java.util.Scanner;

public class No2235 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入num1:");
        num1=sc.nextInt();
        while (num1<-100||num1>100){
            System.out.println("请重新输入num1:");
            num1=sc.nextInt();
        }
        System.out.println("请输入num2:");
        num2=sc.nextInt();
        while (num2<-100||num2>100){
            System.out.println("请重新输入num2:");
            num2=sc.nextInt();
        }
        System.out.println(num1+num2);
    }
}
