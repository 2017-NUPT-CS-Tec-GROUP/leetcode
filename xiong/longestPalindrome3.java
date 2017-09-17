package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class longestPalindrome3 {

	public String longestPalindrome(String s) {
		int maxLength=0,Start=0;
		int s_len=s.length();
		boolean len[][]=new boolean[s_len+1][s_len+1];
		for(int i=0;i<=s_len;i++){
			for(int j=0;j<=s_len-i;j++){
				if(i==0||i==1){
					len[j][j+i]=true;
				}
				else if(s.charAt(j)==s.charAt(j+i-1)){
					len[j][j+i]=len[j+1][j+i-1];
				}
				else{
					len[j][j+i]=false;
				}
				if(len[j][j+i]==true&&i>maxLength){
					Start=j;
					maxLength=i;
				}
			}
		}
		return s.substring(Start, maxLength+Start);
	    }
}
