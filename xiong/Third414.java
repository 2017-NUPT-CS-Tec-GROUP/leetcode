package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Third414 {



public int thirdMax(int[] nums) {
	if(nums.length==1)
		return nums[0];
     Arrays.sort(nums);
     int p[]=new int[nums.length];
     int n=0;
     for(int m=nums.length-1;m>=0;m--){
    	 p[n]=nums[m];
    	 n++;
     }
     nums=p;
     List<Integer> a=new LinkedList<Integer>();
     int now=nums[0],largest=now;//现在的
     int temp=nums[0];//上一个
     int len=0;int res=0;
     a.add(Integer.valueOf(now));
     boolean fir=true;
     for(int i:nums){
    	 if(!fir){
    		 now=i;
    		 if(temp==now){
    			 
    		 }else{
    			 a.add(Integer.valueOf(i)); 		
    			 len++;
    			 if(len==2)
    				 res=i;   

    		 }
    		 temp=now;
    	 }
    	 fir=false;
     }
     if(len==0)
    	 return largest;
     else if(len==1)
    	 return largest;
     else
	 return res;
    }
	 
	 }
