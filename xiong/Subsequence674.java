package leetCode;


public class Subsequence674 {

	  public int findLengthOfLCIS(int[] nums) {
		  if(nums.length==0)
			  return 0;
	       int lon=1,len=1;
	       boolean fir=true;
	       int t1=nums[0];
	       for(int k:nums){
	    	   if(!fir){
	    		   int temp=k;
	    		   if(t1<k){
	    			   len++;
	    		   }else{
	    			   if(lon>len){
	    				   len=1;
	    			   }else{
	    				  lon=len;
	    				  len=1;
	    			   }
	    		   }
	    		   t1=temp;
	    	   }
	    	   fir=false;
	       }
	       if(lon>len){
			   len=1;
		   }else{
			  lon=len;
			  len=1;
		   }
		   return lon;
	    }
	 
	 }
