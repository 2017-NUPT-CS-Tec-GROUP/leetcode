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


public class checkperfectnumber {
	  public boolean checkPerfectNumber(int num) {
		  if(num==1) return true;
	        int t=(int)Math.sqrt(num);
	        int sum=1;
	        for(int j=2;j<=t;j++){
	        	if(num%j==0){
	        		sum+=j+num/j;
	        	}
	        }
	        if(sum==num)
		  return true;
	        else
	        	return false;
	    }
	 }
