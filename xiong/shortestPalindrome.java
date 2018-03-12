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

public class shortestPalindrome {
	
	public String shortestPalindrome(String s) {
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==s.charAt(j))
                j++;
        }
        if(j==s.length())
            return s;
        String suffix = s.substring(j);
        return new StringBuilder(suffix).reverse().toString()+shortestPalindrome(s.substring(0, j))+suffix;
    }
	public String shortestPalindrome2(String s) {
		if(s.equals(""))
			return "";
		if(isPalindrome(s))
			return s;
		String newS="";
		for(int i=s.length()-1;i>=0;i--){
			 newS=newS+s.charAt(i);
			 if(isPalindrome(newS+s))
				 return newS+s;
		}
		return "";
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
	    
}