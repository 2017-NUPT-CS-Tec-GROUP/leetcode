package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Insert35 {
public int searchInsert(int[] nums, int target) {//给定位置插入数字
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


public int findUnsortedSubarray(int[] nums) {//发觉数组内乱序的数
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

public boolean canPlaceFlowers(int[] flowerbed, int n) {
	if(n==0)
		return true;
	int len = flowerbed.length;
	
	if(len==1&&n==1&&flowerbed[0]==0){
		return true;
	}
	
	if(n>=len)
		return false;//1,0 1
	for(int j=0;j<len;j++){
		if(j==0&&flowerbed[j+1]==0&&flowerbed[j]==0){
			n--;
			flowerbed[j]=1;
		}
		else if(j==len-1&&flowerbed[j-1]==0&&flowerbed[j]==0){
			n--;
			flowerbed[j]=1;
		}
		else if(j>0&&flowerbed[j]==0&&flowerbed[j-1]==0&&flowerbed[j+1]==0){
			n--;
			flowerbed[j]=1;
		}
		if(n==0)
			return true;
	}
	return false;
}

public double findMaxAverage(int[] nums, int k) {//找最大的平均数
		int len=nums.length;
	        if(len==1){
			return (double)nums[0];
		}
	   	 double temp=0;
	   	 for(int j=0;j<k;j++){
			temp+=nums[j];
		}
	   	double res=temp;
		for(int i=1;i<=len-k;i++){
			temp=temp-nums[i-1]+nums[i+k-1];
			
			if(temp>res){
				res=temp;
			}
		}
	    return res/k;
}
	 }
