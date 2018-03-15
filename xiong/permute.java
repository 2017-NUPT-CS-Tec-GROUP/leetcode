package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class permute {

	public List<List<Integer>> permute(int[] nums) {
		  List<List<Integer>> res=new LinkedList<List<Integer>>();

		  int num=nums.length;
		  List<Integer> t=new LinkedList<Integer>();
		  for(int a:nums){
			  t.add(a);
		  }
		  return fullarrangement2(res,t,num);
	    }
  public List<List<Integer>> fullarrangement2(List<List<Integer>> res,List<Integer> t,int num){
		if(num==0)
			return res;
		if(res.isEmpty()){
				for(Integer o:t){
					List<Integer> p=new LinkedList<Integer>();
					p.add(o);
					res.add(p);
				}
			}
			else{		
				List<List<Integer>> res1=new LinkedList<List<Integer>>();
				for(Integer a:t){
				for(List<Integer> q:res){
					if(!q.contains(a)){
						List<Integer> p=new LinkedList<Integer>();
						for(Integer y:q){
							p.add(y);
						}
						p.add(a);
						res1.add(p);
					}
				}
			}
				return fullarrangement2(res1,t,num-1);
			}
		return fullarrangement2(res,t,num-1);
	}
	
	 }
