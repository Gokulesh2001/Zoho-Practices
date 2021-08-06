package problems2;

public class nQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] grid=new int[8][8];
       
      nqueen(grid,0);
	}
	
	static boolean nqueen(int grid[][],int col) {
		
		if(grid.length<=col) {
			printGrid(grid);
			return true;
		}
		
		for(int i=0;i<grid.length;i++) {
			if(isSafe(grid,i,col)&&check(grid,i,col)) {
				grid[i][col]=1;
				if(nqueen(grid,col+1)) {
					return true;
				}
				grid[i][col]=0;
				
			}
		}
		return false;
	}
	 static void printGrid(int[][] grid) {
		 for(int i=0;i<grid.length;i++) {
			 for(int j=0;j<grid.length;j++) {
				 System.out.print(grid[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 static boolean isSafe(int grid[][],int i,int j) {
		 if(i<0||i>=grid.length||j<0||j>=grid.length) {
			 return false;
		 }
		 return true;
	 }
	 
	 static boolean check(int grid[][],int row,int col) {
		 
		 for(int i=0;i<col;i++) {
			 if(grid[row][i]==1) {
				 return false;
			 }
		 }
		 
		 for(int i=row,j=col;i>=0&&j>=0;i--,j--){
	            if(grid[i][j]==1){
	                return false;
	            }
	        }
		 
		 for(int i=row,j=col;i<grid.length&&j>=0;i++,j--) {
			 if(grid[i][j]==1) {
				 return false;
			 }
		 }
		 return true;
	 }
}
