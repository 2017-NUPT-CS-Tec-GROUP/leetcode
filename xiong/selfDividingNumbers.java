package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class selfDividingNumbers {


	 public List<Integer> selfDividingNumbers(int left, int right) {
		 List<Integer> res= new LinkedList<Integer>();
		 for(int i=left;i<=right;i++){
			 if(i<=9) res.add(i);
			 if(i>10) {
				 char[] t=String.valueOf(i).toCharArray();
				 int count=0;
				 for(char m:t){
					 if(m!='0'){
						 if(i%(m-'0')==0){
							 count++;
							 continue;
						 }
						 else{
							 break;
						 }
					 }else{
						 break;
					 }
				 }
				 if(count==t.length) res.add(i);
				 count=0;
			 }
		 }
		 
		 return res;
	    }
	 
	 }
