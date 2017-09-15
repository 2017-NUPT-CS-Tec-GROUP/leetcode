package leetCode;

import java.util.HashMap;


public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     HashMap<Integer, Integer> a= new HashMap<Integer,Integer>();
     int n=0;int m=0,temp=0;
     int len=nums2.length;
     int tag=0;
     for(;n<len;n++){
    	 tag=n+1;temp=nums2[n];
    	 if(tag==len){
  			a.put(Integer.valueOf(temp), -1);
  		 }
    	 while(tag<len){
    		 if(temp<nums2[tag]){
    			a.put(Integer.valueOf(temp), Integer.valueOf(nums2[tag]));
    			break;
    		 }
    		 tag++;
    		 if(tag==len){
     			a.put(Integer.valueOf(temp), -1);
     			break;
     		 }
    	 }
     }
     int[] res=new int[nums1.length];
     for(int q=0;q<nums1.length;q++){
    	 res[q]=a.get(Integer.valueOf(nums1[q]));
     }
    	return res;
    }
	 
	 }
