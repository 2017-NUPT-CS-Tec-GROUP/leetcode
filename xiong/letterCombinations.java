package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class letterCombinations {
	String[][] digits_s={{},{},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};

	public List<String> letterCombinations(String digits) {
	List<String> res=new LinkedList<String>();
	int len=digits.length();
	String temp="";
	for(int i=0;i<len;i++){
        res = letterCombinations(digits.charAt(i), res);
	}
	return res;
    }


      private List<String> letterCombinations(char charAt, List<String> res) {
    		List<String> res2=new LinkedList<String>();
    	  int t=charAt-'0';
    	  for(String temp:digits_s[t]){
    		  if(res.isEmpty()){
    			  res2.add(temp);
    		  }else{
    			  for(String temp_list:res){
        			  res2.add(temp_list+temp);
        		  } 
    		  }
    		
    	  }
    	  return res2;
      }

}
