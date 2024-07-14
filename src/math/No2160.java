package math;

public class No2160 {
    public static void main(String[] args) {
        int end = minimumSum(4009);
        System.out.println(end);
    }
    public static int minimumSum(int num) {
        int a=num%10;
        num=num/10;
        int b=num%10;
        num=num/10;
        int c=num%10;
        num=num/10;
        int d=num;
        int []arr={a,b,c,d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int end=arr[0]*10+arr[2]+arr[1]*10+arr[3];
        return end;
    }
}
