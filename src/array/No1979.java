package array;

import java.util.Arrays;

public class No1979 {
    public static void main(String[] args) {
        int arr[] = new int[]{7, 5, 6, 8, 3};
        int gcd = new No1979().findGCD1(arr);
        System.out.println(gcd);
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int maxSed = max / 2;
        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public int findGCD1(int[] nums) {//辗转相除求公约数
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int gcd = gcd(max, min);
        return gcd;
    }
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
