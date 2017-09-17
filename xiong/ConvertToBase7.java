package leetCode;

public class ConvertToBase7 {
	 public String convertToBase7(int num) {
	        int i=0;int sum=0;String res="";
	        while(Math.pow(7, i)<num){
	        	i++;
	        }
	        res=res+String.valueOf(i-1);
	        return res;
	    }
}
