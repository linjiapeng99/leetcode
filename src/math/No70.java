package math;

public class No70 {
    public static void main(String[] args) {
        int end = climbStairs(45);
        System.out.println(end);
    }
//    public static int climbStairs(int n) {
//        if(n==1){
//            return 1;
//        }else if(n==2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//    }
    public static int climbStairs(int n) {
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=2;
        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
