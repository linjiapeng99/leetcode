package array;

import java.util.Arrays;

public class No2574 {
    public static void main(String[] args) {
        int[] answer = new No2574().leftRightDifference(new int[]{1});
        System.out.println(Arrays.toString(answer));
    }

    public int[] leftRightDifference(int[] nums) {
        int[] leftArr = new int[nums.length];
        leftArr[0] = 0;
        int[] rightArr = new int[nums.length];
        rightArr[rightArr.length - 1] = 0;
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            leftArr[i] = nums[i - 1] + leftArr[i - 1];
            rightArr[j] = nums[j + 1] + rightArr[j + 1];
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.abs(leftArr[i] - rightArr[i]);
        }
        return answer;
    }
}
