package leetCode;


public class DiagonalTraverse498 {

	 public int[] findDiagonalOrder(int[][] matrix) {
		 if(matrix.length==0){
			 int io[]={};
			 return io;
		 }
		 int len=matrix.length;
		 int n_len=matrix[0].length;
	         int[] res=new int[len*n_len];
	         int i = 0, j = 0;
	         boolean up=true;
	         for (int k = 0; k < matrix.length * matrix[0].length; k++) {
	             res[k] = matrix[i][j];
	             if (up) {// 往右上走
	                 if ((i-1) >= 0 && (j+1) < matrix[0].length) {
	                     i--;
	                     j++;
	                 } else if ((j+1) < matrix[0].length) {
	                     j++;
	                     up = false;
	                 } else if ((i+1) < matrix.length) {
	                     i++;
	                     up = false;
	                 } else break;
	             } else {// 往左下走
	                 if ((i+1) < matrix.length && (j-1) >= 0) {
	                     i++;
	                     j--;
	                 } else if ((i+1) < matrix.length) {
	                     i++;
	                     up = true;
	                 } else if ((j+1) < matrix[0].length) {
	                     j++;
	                     up = true;
	                 } else break;
	             }
	         }
	         return res;
	    }
	 
	 }
//0 0
//0 1  1 0
//2 0  1 1  0 2
//1 2  2 1
//2 2
