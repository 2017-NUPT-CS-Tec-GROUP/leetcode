package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class UniquePaths {



    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid.length==0||obstacleGrid==null)
       	 return 0;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1) 
            return 0;
     
        int a[][]=new int[m][n];
       a[0][0]=1;
        for(int i=1;i<m;i++){
       	 if(obstacleGrid[i][0]==1)
       		 a[i][0]=0;
       	 else
       		 a[i][0]=a[i-1][0];
        }
        for(int j=1;j<n;j++){
       	 if(obstacleGrid[0][j]==1)
       		 a[0][j]=0;
       	 else
       		 a[0][j]=a[0][j-1];
        }
        for(int i=1;i<m;i++){
       	 for(int j=1;j<n;j++){
       		 if(obstacleGrid[i][j]==1)
       			 a[i][j]=0;
       		 else
       			 a[i][j]=a[i-1][j]+a[i][j-1];
       	 }
        }

   	return a[m-1][n-1];   
   	}
	 
	 }
