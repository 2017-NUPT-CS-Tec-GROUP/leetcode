package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class T122BestTimetoBuyandSellStockII {

	 public int maxProfit(int[] prices) {
		 int len = prices.length;
		 int res=0;
		 for(int i=0;i<len-1;i++){
			 int temp=prices[i+1]-prices[i];
			 if(temp>0){
				 res+=temp;
			 }else{
				 
			 }
		 }
	     return res;
	    }
	 
	 }
