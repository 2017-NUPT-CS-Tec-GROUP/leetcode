package leetCode;


public class ReverseWords {

	 public boolean judgeCircle(String moves) {
		 int U,D,R,L;
		 U=D=R=L=0;
	        for(int i=0;i<moves.length();i++){
	            if(moves.charAt(i)=='U'){
	            	U++;
	            }
	            if(moves.charAt(i)=='D'){
	            	D++;
	            }
	            if(moves.charAt(i)=='R'){
	            	R++;
	            }
	            if(moves.charAt(i)=='L'){
	            	L++;
	            }
	        }
	        if(U==D&&R==L)
	        return true;
	        else
	        	return false;
	    }
	 
	 }
