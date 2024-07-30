package array;

public class No485 {
    public static void main(String[] args) {
        int maxOne = new No485().findMaxConsecutiveOnes1(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println(maxOne);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
        }
        String[] split = str.split("0");
        int maxOne = 0;
        for (int i = 0; i < split.length; i++) {
            maxOne = maxOne > split[i].length() ? maxOne : split[i].length();
        }
        return maxOne;
    }

    public int findMaxConsecutiveOnes1(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        maxCount=Math.max(count,maxCount);
        return maxCount;
    }
}
