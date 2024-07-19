package math;

public class No50 {
    public static void main(String[] args) {
        double result = myPow(2, -2);
        System.out.println(result);
    }

    public static double myPow(int x,int n){
        if(n == 0) return 1;
        if(n % 2 == 0) {
            double tmp = myPow(x, n / 2);
            return tmp * tmp;
        }
        if(n < 0) return 1 / myPow(x, -n);
        return x * myPow(x, n - 1);
    }
    /*public static double myPow(double x, int n) {
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
    }*/
    /*public static double myPow(double x, int n) {
        if (x == 1 || n == 0) {//解决边界情况
            return 1.0;
        }
        if(n<0){//解决中间情况
            return 1/myHafePow(x,Math.abs(n));
        }else {
            return myHafePow(x,n);
        }
    }
    private static double myHafePow ( double x, Integer n){//如果中间情况和边界情况写在一个函数中的话，那么就会一直返回1.0
        if (n == 1) {
            return x;
        }
        if (n % 2 != 0) {
            double y = myHafePow(x, n / 2);
            return y * y * x;
        } else {
            double y = myHafePow(x, n / 2);
            return y * y;
        }
    }*/
    /*public static double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double ans=1;
        for (int i = 0; i < N; i++) {
            ans=ans*x;
        }
        return ans;
    }*/


}
//利用分治思想，递归+分治