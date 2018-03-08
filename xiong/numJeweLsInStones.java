package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import leetCode.T.TreeNode;

/**
 * Definition for a binary tree node.

 */

public class numJeweLsInStones {

	   public int numJewelsInStones(String J, String S) {
	     char[] j1=J.toCharArray();
	     char[] s1=S.toCharArray();
    	 Set<Character> s2=new HashSet<Character>();
	     for(char temp:j1){
	    	 s2.add(temp);
	     }
	     int count=0;
	     for(char temp:s2){
	    	 for(char s_temp:s1){
	    		 if(s_temp==temp)
	    			 count++;
	    	 }
	     }
		   return count;
	    }
}