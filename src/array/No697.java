package array;

import java.util.*;

public class No697 {
    public static void main(String[] args) {
        int shortestSubArray = new No697().findShortestSubArray(new int[]{1,3,2,2,3,1});
        System.out.println(shortestSubArray);
    }
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        //System.out.println(map);
        List<Integer>list=new ArrayList<>();
        int max=nums[0];
        for (Integer key : map.keySet()) {
            if(map.get(key)>map.get(max)){
                max=key;
            }
        }
        //System.out.println(max);
        list.add(max);
        for (Integer key : map.keySet()) {
            if(map.get(key)==map.get(max)){
                if(!list.contains(key)){
                    list.add(key);
                }
            }
        }
        //System.out.println(list);
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < list.size();) {
            int left=0,right=nums.length-1;
            int a=list.remove(0);
            while (true){
                if(a==nums[left]){
                    break;
                }
                left++;
            }
           //System.out.println(left);
            while (true){
                if(a==nums[right]){
                    break;
                }
                right--;
            }
            //System.out.println(right);
            min=min<=right-left+1?min:right-left+1;
        }

        return min;
    }
}
