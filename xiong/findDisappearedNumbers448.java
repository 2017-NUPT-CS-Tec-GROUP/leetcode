package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class findDisappearedNumbers448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> a=new HashSet<Integer>();
      
        for( int k=1;k<=nums.length;k++){
        	a.add(k);
        }
        //
        //
        for(int i:nums){

            if(a.contains(i))
        	a.remove(Integer.valueOf(i));
        }
        List<Integer> res=new LinkedList<Integer>();
        for(int j:a){
        		res.add(Integer.valueOf(j));
        }
    	return res;
    }
	 
	 }
