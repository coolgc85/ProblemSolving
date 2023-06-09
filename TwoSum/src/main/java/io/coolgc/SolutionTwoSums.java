package io.coolgc;

import java.util.*;

public class SolutionTwoSums {

    private Map<Integer,Integer> numMap = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int complement = target - num;


            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),index};
            }
            numMap.put(num, index);
        }
        return new int[]{-1};
    }

}
