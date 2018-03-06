package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class findComplement {


	 public int findComplement(int num) {
	int len=Integer.toString(num, 2).toCharArray().length;
	int Checkpoint=(int)Math.pow(2, len)-1;
		 return Checkpoint-num;        
	    }
	 }
