package math;
//返回一个淑数n和2的最小公倍数
public class No2413 {
    public static void main(String[] args) {
        int n = smallestEvenMultiple(50);
        System.out.println(n);
    }
    public static int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }else {
            return 2*n;
        }
    }
}