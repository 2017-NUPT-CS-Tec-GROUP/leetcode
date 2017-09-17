package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
	        int[] a=new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(target==nums[i]+nums[j]){
	                    a[0]=i;
	                    a[1]=j;
	                    return a;
	                }
	            }
	        }
			return a;
	    }
	public int[] twoSum2(int[] nums, int target) {
		Integer[] newNum=new Integer[nums.length];
        for(int i= 0;i<nums.length;i++){
            newNum[i]=Integer.valueOf(nums[i]);
        }
        System.out.println(Arrays.toString(newNum));
        List<Integer> list=Arrays.asList(newNum);
        int[] a=new int[2];
        for(int j=0;j<nums.length;j++){
        	if(list.contains(Integer.valueOf(target-nums[j]))&&list.indexOf(Integer.valueOf(target-nums[j]))!=j){
        		a[0]=j;
        		a[1]=list.indexOf(Integer.valueOf(target-nums[j]));
        		return a;
        	}
        }
        return a;
    }
}
