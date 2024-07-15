package math;

public class No1688 {
    public static void main(String[] args) {
        int count = numberOfMatches(15);
        System.out.println(count);
    }

    public static int numberOfMatches(int n) {
        if(n==2){
            return 1;
        }
        int count = 0;
        int x;
        if (n % 2 == 0) {
            x = n / 2;
            count+=x;
            return count+numberOfMatches(n/2);
        }else {
            x = n / 2;
            count+=x;
            return count+numberOfMatches((n-1)/2+1);
        }
    }
}
