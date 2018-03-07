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

public class mergeTrees {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		 if(t1==null&&t2==null)
			 return null;
		 if(t1==null&&t2!=null)
			 return t2;
		 if(t2==null&&t1!=null)
			 return t1;
		 if(t1!=null&&t2!=null){
			 t1.val=t1.val+t2.val;
			 t1.left=mergeTrees(t1.left,t2.left);
			 t1.right=mergeTrees(t1.right, t2.right);
		 }
		return t1;
	    }
}