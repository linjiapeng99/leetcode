package math;

public class No509 {
    public static void main(String[] args) {
        int fib = fib(30);
        System.out.println(fib);
    }
/*    public static int fib1(int n) {
        if(n==1||n==2){
            return 1;
        }else {
            return fib1(n-1)+fib1(n-2);
        }
    }*/
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        int arr[]=new int[n+1];//因为下面有赋值索引1所以长度至少为2
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}
