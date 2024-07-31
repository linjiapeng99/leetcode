package array;

import java.util.Arrays;

public class No414 {
    public static void main(String[] args) {
        int thirdMax = new No414().thirdMax(new int[]{ 2, 1});
        System.out.println(thirdMax);
    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int third=2;
        for (int i = nums.length-1; i>0; i--) {
            if(nums[i]> nums[i-1]){
                third--;
            }
            if(third==0){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
