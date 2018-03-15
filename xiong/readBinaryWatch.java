package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class readBinaryWatch {
	  public List<String> readBinaryWatch(int num) {
		  List<String> res=new LinkedList<String>();
		  if(num==0){
			  res.add("0:00");
			  return res;
		  }
		  int t1[]={1,2,4,8};
		  int t2[]={1,2,4,8,16,32};
		  HashSet<Integer> t3=new HashSet<Integer>();
		  HashSet<Integer> t4=new HashSet<Integer>();
		  for(int l:t1){
			  t3.add(l);
		  }
		  for(int l:t2){
			  t4.add(l);
		  }
		  int a=0,b=0;
			List<List<String>> rest1=new LinkedList<List<String>>();
			List<List<String>> rest2=new LinkedList<List<String>>();
			List<String> t22=new LinkedList<String>();
			List<String> t33=new LinkedList<String>();

			 for(int l:t1){
				 t22.add(String.valueOf(l));
			  }
			 for(int l:t2){
				 t33.add(String.valueOf(l));
			  }
			 for(;a<=num&&a<=4;a++){
				 b=(num-a)>6?6:(num-a);
				rest1=new LinkedList<List<String>>();
				rest2=new LinkedList<List<String>>();
				 rest1=fullarrangement(rest1,t22,a);
				 rest2=fullarrangement(rest2,t33,b);
				 t3=new HashSet<Integer>();
				 int sum=0;
				 for(List<String> p:rest1){
					 for(String q:p){
						 sum+=Integer.valueOf(q);
					 }
					 t3.add(Integer.valueOf(sum));
					 sum=0;
				 }
				 t4=new HashSet<Integer>();
				 int sum1=0;
				 for(List<String> p:rest2){
					 for(String q:p){
						 sum1+=Integer.valueOf(q);
					 }
					 t4.add(Integer.valueOf(sum1));
					 sum1=0;
				 }
				 final List<Integer> list = new ArrayList<Integer>();  
			        for(final Integer value : t3){  
			            list.add(value);  
			        }  
			        Collections.sort(list);  
			        final List<Integer> list2 = new ArrayList<Integer>();  
			        for(final Integer value : t4){  
			            list2.add(value);  
			        }  
			        Collections.sort(list2);  
			        
				 if(list.isEmpty()){
					 for(int q:list2){
						 if(q<60){
							 res.add(String.format("0"+":%02d",q));
							 System.out.println(String.format("0"+":%02d",q));
						 }
					 }
				 }
				 if(list2.isEmpty()){
					 for(int q:list){
						 if(q<12)
						 res.add(String.format(""+q+":00"));
					 }
				 }
				 for(int p:list){
					 for(int q:list2){
						 if(p>0&&p<12&&q<60)
						 res.add(String.format(""+p+":%02d",q));
					 }
				 }
			 }
		  return res;
	    }



	  public List<List<Integer>> permute(int[] nums) {
		  List<List<Integer>> res=new LinkedList<List<Integer>>();

		  int num=nums.length;
		  List<Integer> t=new LinkedList<Integer>();
		  for(int a:nums){
			  t.add(a);
		  }
		  return fullarrangement2(res,t,num);
	    }

	public List<List<String>> fullarrangement(List<List<String>> res,List<String> t,int num){
		if(num==0)
			return res;
		if(res.isEmpty()){
				for(String o:t){
					List<String> p=new LinkedList<String>();
					p.add(o);
					res.add(p);
				}
			}
			else{		
				List<List<String>> res1=new LinkedList<List<String>>();
				for(String a:t){
				for(List<String> q:res){
					if(!q.contains(a)){
						List<String> p=new LinkedList<String>();
						for(String y:q){
							p.add(y);
						}
						p.add(a);
						res1.add(p);
					}
				}
			}
				return fullarrangement(res1,t,num-1);
			}
		return fullarrangement(res,t,num-1);
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
	
	
	public List<String> readBinaryWatch1(int num) {
	    List<String> times = new ArrayList<String>();
	    for (int h = 0; h < 12; h++)
	        for (int m = 0; m < 60; m++)
	            if (Integer.bitCount(h)+Integer.bitCount(m) == num)
	                times.add(String.format("%d:%02d", h, m));
	    return times;
	}
	
}
