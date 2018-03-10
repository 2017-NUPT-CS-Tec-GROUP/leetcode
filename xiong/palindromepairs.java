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

import leetCode.T.TreeNode;

/**
 * Definition for a binary tree node.

 */

public class palindromepairs {
	 public List<List<Integer>> palindromePairs(String[] words) {
		 List<List<Integer>> res=new LinkedList<List<Integer>>();
		 Map<String,Integer> words_map=new HashMap<String, Integer>();	
		 int len=words.length;
		 for(int i=0;i<len;i++){
			 words_map.put(words[i], i);
		 }
		 if(len<=1){
			 return res;
		 }
		 for(int i=0;i<len;i++){
			 for(int j=0;j<=words[i].length();j++){
				 String s1=words[i].substring(0,j);
				 String s2=words[i].substring(j, words[i].length());
				 if(isPalindrome(s1)){
					 StringBuffer t=new StringBuffer(s2);
					 s2=t.reverse().toString();
					 if(words_map.containsKey(s2)&&words_map.get(s2)!=i){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(words_map.get(s2));	
						 temp.add(i);
						 res.add(temp); 
					 }
				 }
				 
				 if(isPalindrome(s2)&&s2.length()!=0){
					 StringBuffer t=new StringBuffer(s1);
					 s1=t.reverse().toString();
					 if(words_map.containsKey(s1)&&words_map.get(s1)!=i){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(i);		
						 temp.add(words_map.get(s1));	
						 res.add(temp); 
					 }
				 }
			 }
		 }
	 return res;	 
	 }
	
	 public List<List<Integer>> palindromePairs2(String[] words) {
		 List<List<Integer>> res=new LinkedList<List<Integer>>();
		 int len=words.length;
		 if(len<=1){
			 return res;
		 }
		 for( int i=0;i<len-1;i++){
			 for(int j=i+1;j<=len-1;j++){
				 String s1=words[i];
				 String s2=words[j];
				 if(s1.length()>s2.length()){
					 StringBuffer s=new StringBuffer(s2);
					 s2=s.reverse().toString();
					 int a=s1.indexOf(s2);
					 if(s2==""&&isPalindrome(s1)){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(j);
						 temp.add(i);	
						 res.add(temp); 
						 temp=new LinkedList<Integer>();
						 temp.add(i);
						 temp.add(j);	
						 res.add(temp); 
					 }
					 if(a==0&&isPalindrome(s1.substring( a,s1.length()))){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(i);
						 temp.add(j);	
						 res.add(temp); 
					 }
					 if(a>0&&isPalindrome(s1.substring(0, a))){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(j);
						 temp.add(i);	
						 res.add(temp); 
					 }
				 }else if(s1.length()==s2.length()){
					 StringBuffer s=new StringBuffer(s1);
					 if(s.reverse().toString().equals(s2)){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(i);
						 temp.add(j);	
						 res.add(temp); 

						 temp=new LinkedList<Integer>();
						 temp.add(j);
						 temp.add(i);
						 res.add(temp); 
					 }
				 }else{
					 StringBuffer s=new StringBuffer(s1);
					 s1=s.reverse().toString();
					 int b=s2.indexOf(s1);
					 if(s1==""&&isPalindrome(s2)){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(j);
						 temp.add(i);	
						 res.add(temp); 
						 temp=new LinkedList<Integer>();
						 temp.add(i);
						 temp.add(j);	
						 res.add(temp); 
					 }
					 if(b==0&&isPalindrome(s2.substring(b, s2.length()))){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(j);
						 temp.add(i);	
						 res.add(temp); 
					 } 
					 if(b>0&&isPalindrome(s2.substring(0,b))){
						 List<Integer> temp=new LinkedList<Integer>();
						 temp.add(i);
						 temp.add(j);	
						 res.add(temp); 
					 } 
				 }
//				 
//				 
//				 
//				 StringBuffer s=new StringBuffer(words[i]);
//				 String s2=s.reverse().toString();
//				 int a=s2.indexOf(words[j]);
//				 int b=words[j].indexOf(s2);
//				 if( a!=-1||b!=-1){
//					 if(a!=-1){
//						 if(isPalindrome(s2.substring(0, a))){
//							 List<Integer> temp=new LinkedList<Integer>();
//							 temp.add(i);
//							 temp.add(j);
//							 res.add(temp);
//						 }
//					 }else{
//						 if(isPalindrome(words[j].substring(0, b))){
//							 List<Integer> temp=new LinkedList<Integer>();
//							 temp.add(j);
//							 temp.add(i);
//							 res.add(temp);
//						 }
//					 }
//				 }
			 }
			
		 }
		 return res;
	    }
	   
	    public boolean isPalindrome(String s) {
	        int k=0;
	        int j=s.length()-1;
	        while(k<=j){
	            if(s.charAt(k)==s.charAt(j)){
	                
	            }
	            else{
	                return false;
	            }
	            k++;
	            j--;
	        }
	        return true;
	    }
}