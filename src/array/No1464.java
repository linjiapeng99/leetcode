package array;

public class No1464 {
    public static void main(String[] args) {
        int end = new No1464().maxProduct(new int[]{3, 4, 5, 2});
        System.out.println(end);
    }

    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
            }
        }
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
