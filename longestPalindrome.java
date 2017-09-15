package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class longestPalindrome {

	public String longestPalindrome(String s) {
		 if(s.length()==1)
			 return s;
		 
	     int lastIndex=s.length();
	     String S_in="";
	     HashMap<Integer,String> backs= new HashMap<Integer,String>();
	     int i=0;
	     while(i<s.length()){
	    	 while(lastIndex>=1){
	    		 if(lastIndex-i>1)
		    	  S_in=s.substring(i, lastIndex);
		    	 if(IsPalindrome(S_in)){
		    		 if(!backs.containsKey(S_in.length()))
		    		 backs.put( S_in.length(),S_in);
		    	 }
		    	 lastIndex--;
		     }
		     lastIndex=s.length();
		     i++;
	     }
	     if(findLongest(backs).length()==1)
	    	 return s.substring(0, 1);
		 return findLongest(backs);
	    }
	public boolean IsPalindrome(String s) {
		char[] CharArray_s=s.toCharArray();
		int i=0;
		int lastindex=s.length()-1;
		while(i<lastindex){
			if(CharArray_s[i]==CharArray_s[lastindex]){
				i++;
				lastindex--;
			}
			else{
				return false;
			}
		}
       return true;
   }
	public String findLongest(Map<Integer,String> s) {
      if(s.isEmpty()) return "1";
      Object[] c=s.keySet().toArray();
      Arrays.sort(c);
      int a=c.length;
      int  max= (Integer) c[a-1];
      for(int i=0;i<a;i++){
    	  if((Integer)c[i]==max){
    		  return s.get(c[i]);
    	  }
    	  
      }
		return s.get(max);
   }
}
