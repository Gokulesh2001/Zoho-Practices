package problems2;

public class adjMatSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int mat[][]= {{1,3,4,6,2},{3,5,8,9,0},{1,7,3,2,4},{2,3,1,4,2},{6,4,3,2,1}};
      
      int sum=10;
      
      for(int i=0;i<mat.length;i++) {
    	  for(int j=0;j<mat[0].length;j++) {
    		  if(isSafe(mat,i,j+1)&&mat[i][j]+mat[i][j+1]==sum) {
    			  System.out.println(mat[i][j]+"+"+mat[i][j+1]+"="+sum);
    		  }
    		  if(isSafe(mat,i+1,j+1)&&mat[i][j]+mat[i+1][j+1]==sum) {
    			  System.out.println(mat[i][j]+"+"+mat[i+1][j+1]+"="+sum);
    		  }
    		  if(isSafe(mat,i+1,j)&&mat[i][j]+mat[i+1][j]==sum) {
    			  System.out.println(mat[i][j]+"+"+mat[i+1][j]+"="+sum);
    		  }
    	  }
      }
	}
    
	static boolean isSafe(int[][] mat,int i,int j) {
		if(i<0 || i>=mat.length || j<0 ||j>=mat[0].length) {
			return false;
		}
		return true;
	}
}
