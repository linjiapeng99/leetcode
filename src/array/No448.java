package array;

import java.util.*;

public class No448 {
    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new No448().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(disappearedNumbers);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i <nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 1; i <=n; i++) {
            if(!list.contains(i)){
                list1.add(i);
            }
        }*/
        List<Integer> list = new ArrayList<>();
        /*Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i] - nums[i - 1];
            if (a > 1) {
                for (int j = 0; j < a; j++) {
                    list.add(nums[i - 1] + a);
                }
            } else if (a==0) {
                list.add(nums[i-1]+1);
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==i+1){
                continue;
            }
            if(nums[i]==nums[nums[i]-1]){
                continue;
            }
            int temp=nums[nums[i]-1];
            nums[nums[i]-1]=nums[i];
            nums[i]=temp;
            i--;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
        /*List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1) {
                i++;
                continue;
            }
            int idealIdx = nums[i] - 1;
            if (nums[i] == nums[idealIdx]) {
                i++;
                continue;
            }
            int tmp = nums[i];
            nums[i] = nums[idealIdx];
            nums[idealIdx] = tmp;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                res.add(j + 1);
            }
        }
        return res;*/
    }
}
