package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class hammingDistance {
	 public int hammingDistance(int x, int y) {
	        String x1=Integer.toBinaryString(x);
	        String y1=Integer.toBinaryString(y);
	        String a=x1; String b=y1;
	        if(a.length()>b.length()){
	        	String add_str="";
	        	for(int j=0;j<a.length()-b.length();j++){
	        		add_str+="0";
	        	}
	        	b=add_str+b;
	        }else if(a.length()<b.length()){
	        	String add_str="";
	        	for(int j=0;j<b.length()-a.length();j++){
	        		add_str+="0";
	        	}
	        	a=add_str+a;
	        }
	        StringBuffer t1=new StringBuffer(a);
	       ;
	        StringBuffer t2=new StringBuffer(b);
	       
	        char[] x11=String.valueOf( t1.reverse().toString()).toCharArray();
	        char[] y11=String.valueOf( t2.reverse().toString()).toCharArray();
	        int i=0,count=0;
	        for(;i<x11.length;i++){
	        	if(x11[i]!=y11[i]){
	        	count++;
	        	}
	        	
	        }
	       
		 return count;
	        
	 }
}