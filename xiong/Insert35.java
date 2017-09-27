package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Insert35 {
public int searchInsert(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
    	if(nums[i]<target){
    		if(i+1==nums.length)
    			return i+1;
    	}else if(nums[i]==target){
    		return i;
    	}else if(nums[i]>target){
    		return i;
    	}
    }    
	return 0;
    }
public int arrayPairSum(int[] nums) {
	Arrays.sort(nums);
	int res=0;
	int  index=1;
	for(int i:nums){
		if(index%2==1){
			res+=i;
		}
		index++;
	}
    return res;
}
public int findUnsortedSubarray(int[] nums) {
    int len=nums.length;
    int[] temp=new int[len];
    temp=Arrays.copyOf(nums, len);
    Arrays.sort(nums);
    int start=0;
    int  end=0;
    boolean count_start=true;
    boolean count_end=false;
    for(int j=0;j<len;j++){
    	if(temp[j]==nums[j]&&count_end){
    		end=j;
    		count_end=false;
    	}else if(count_start&&temp[j]!=nums[j]){
    		start=j;
    		count_start=false;
    		count_end=true;
    		if(temp[len-1]!=nums[len-1]){
    			return len-start;
    		}
    	}else if(count_end&&j+1==len){
    		return len-start;
    	}else if(temp[j]!=nums[j]){
    		count_end=true;
    	}
    }
    return end-start;
}
	 }
