package array;

import java.util.Arrays;

public class No645 {
    public static void main(String[] args) {
        int[] errorNums = new No645().findErrorNums(new int[]{2, 2});
        System.out.println(Arrays.toString(errorNums));
    }

    public int[] findErrorNums(int[] nums) {
        int newArr[] = new int[2];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                newArr[0] = nums[i - 1];
            }
        }
        newArr[1] = newArr[0] + 1;
        return newArr;
    }
}
