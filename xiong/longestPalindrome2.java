package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class longestPalindrome2 {

	public String longestPalindrome(String s) {
		int i=0,last=s.length();
		HashMap<Integer,String> m= new HashMap<Integer,String>();
		String subs2="";
		while(i<last){
			boolean ift1=true,ift2=true;
			for(int a=0;i-a>=0&&i+a+1<=last;a++){
				String subs=s.substring(i-a, i+a+1);
				if(i+a+2<=last)
				 subs2=s.substring(i-a, i+a+2);
				if(IsPalindrome(subs)&&ift1){
					if(!m.containsKey(subs.length()))
					m.put(subs.length(), subs);
				}
				else 
					ift1=false;
				if(IsPalindrome(subs2)&&ift2){
					if(!m.containsKey(subs2.length()))
					m.put(subs2.length(), subs2);
				}
				else 
					ift2=false;
			}
			i++;
		}
		if(findLongest(m)=="")
			return s.substring(0, 1);
		return findLongest(m);
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
      if(s.isEmpty()) return "";
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
