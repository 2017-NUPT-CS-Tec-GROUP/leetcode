package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ThreeNumbers628 {



public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
	return nums[0]*nums[1]*nums[nums.length-1]>nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]?nums[0]*nums[1]*nums[nums.length-1]:nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }
	 }
