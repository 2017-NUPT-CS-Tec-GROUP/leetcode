package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Subsets {


	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>>  res =new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for(int n:nums){
			int size=res.size();
			for(int i=0;i<size;i++){
				List<Integer> t=new ArrayList<Integer>(res.get(i));
				t.add(n);
				res.add(t);
			}
		}
		return res;
    }
	 
	 }
