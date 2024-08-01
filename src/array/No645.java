package array;

import java.util.Arrays;

public class No645 {
    public static void main(String[] args) {
        int[] errorNums = new No645().findErrorNums(new int[]{1, 3, 3});
        System.out.println(Arrays.toString(errorNums));
    }

    /*public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int newArr[]=new int[2];
        if(nums[0]!=1){
            newArr[0]=nums[0];
            newArr[1]=1;
            return newArr;
        }
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]- nums[i-1]==2&&nums[i-1]==nums[i-2]){
                newArr[0]=nums[i-1];
                newArr[1]=nums[i]+1;
                return newArr;
            } else if (nums[i]- nums[i-1]==2&&nums[i]==nums[i+1]) {
                newArr[0]=nums[i];
                newArr[1]=nums[i]-1;
            }
        }
        newArr[0]=nums[nums.length-2];
        newArr[1]=nums[nums.length-2]+1;
        return newArr;
    }*/
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int newArr[] = new int[2];
        int pree = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (pree == curr) {//找出错误的元素
                newArr[0] = pree;
            } else if (curr - pree > 1) {//找出正确的元素
                newArr[1] = curr - 1;
            }
            pree=curr;
        }
        if (nums[nums.length - 1] != nums.length) {
            newArr[1] = nums.length;
        }
        return newArr;
    }
    /*public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        // 计算理论上的和和和平方
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumSquares = (long) n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSumSquares = 0;

        // 计算实际的和和和平方
        for (int num : nums) {
            actualSum += num;
            actualSumSquares += (long) num * num;
        }

        // 计算差值
        long sumDiff = expectedSum - actualSum; // missing - duplicate
        long sumSquaresDiff = expectedSumSquares - actualSumSquares; // missing^2 - duplicate^2

        // 解方程
        long missing = (sumDiff + sumSquaresDiff / sumDiff) / 2;
        long duplicate = missing - sumDiff;

        return new int[] {(int) duplicate, (int) missing};
    }*/
}
