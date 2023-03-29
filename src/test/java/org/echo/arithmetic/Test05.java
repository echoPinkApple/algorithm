package org.echo.arithmetic;

import java.util.HashMap;
import java.util.Map;

public class Test05 {
    
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,4,1};
        findShortestSubArray(arr);
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max=0;
        int maxNum=Integer.MIN_VALUE;
        for (int num : nums) {
            Integer tmp = map.get(num);
            if(tmp>max){
                max=tmp;
                maxNum=num;
            }
        }
        int left=0;
        int right=nums.length;
        while(left<nums.length && nums[left]!=maxNum){
            left++;
        }
        while(right<nums.length && nums[right]!=maxNum){
            right--;
        }
        return right-left;

    }
}
