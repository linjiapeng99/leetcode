package math;

public class No50 {
    public static void main(String[] args) {
        double result = myPow(1, 2147483647);
        System.out.println(result);
    }
    public static double myPow(double x, int n) {
        if(x==1){
            return 1.0;
        }
        double result=1;
        for (int i = 0; i < Math.abs(n); i++) {
            result*=x;
        }
        if(n>0){
            return result;
        }else {
            return 1/result;
        }
    }
}
