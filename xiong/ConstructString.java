package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConstructString {

	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }



	public String complexNumberMultiply(String a, String b) {
        String s1=a.substring(0,a.indexOf("+"));
        String s2=a.substring(a.indexOf("+"),a.length());
        String s22=s2.substring(1, s2.indexOf("i"));
        String s3=b.substring(0,b.indexOf("+"));
        String s4=b.substring(b.indexOf("+"),b.length());
        String s44=s4.substring(1,s4.indexOf("i"));

        int a1=Integer.valueOf(s1);
        int a2=Integer.valueOf(s22);
        int b1=Integer.valueOf(s3);
        int b2=Integer.valueOf(s44);
        String resu=(a1*b1-a2*b2)==0?"0":String.valueOf(a1*b1-a2*b2);
        resu+="+"+(a1*b2+a2*b1)+"i";
        return resu;
    }
	
	public int countSubstrings(String s) {
		int count=0;
        boolean[][] t=new boolean[s.length()+1][s.length()+1];
        for(int i=0;i<=s.length();i++){//长度
        	for(int j=0;j+i<=s.length();j++){//j表示起始步长
        		if(i==0||i==1)
        			t[j][j+i]=true;
        		else if(s.charAt(j)==s.charAt(j+i-1)){
        			t[j][j+i]=t[j+1][j+i-1];
        		}
        		else
        			t[j][j+i]=false;
        		if(t[j][j+i]==true&&i>0){
            		count++;
        		}
        	}
        }
        return count;
    }
}
