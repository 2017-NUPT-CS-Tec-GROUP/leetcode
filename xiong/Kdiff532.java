package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Kdiff532 {
public int findPairs(int[] nums, int k) {
	if(nums.length<=1||nums.length<k){
		return 0;
	}
     Arrays.sort(nums);
     Set<Integer> a= new HashSet<Integer>();
     Set<String> b= new HashSet<String>();
     int res=0;int res1=0;
     for(int i:nums){
    	 if(a.contains(Integer.valueOf(i))){
    		 if(b.contains(""+i+i)){
    			 
    		 }else{
    			 b.add(""+i+i);
    			 res1++;
    		 }
    		 
    	 }else{
        	 a.add(Integer.valueOf(i));
    	 }
     }
     for(int j:a){
    	 if(a.contains(Integer.valueOf(j+k))){
    		 res++;
    	 }
     }
 	if(k==0)
 		return res1;
 	else
 		return res;
 	
    }
	 }
