package array;

public class No1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int newArr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    newArr[i]++;
                }else if(nums[j]>nums[i]){
                    newArr[j]++;
                }
            }
        }
        return newArr;
    }
}
