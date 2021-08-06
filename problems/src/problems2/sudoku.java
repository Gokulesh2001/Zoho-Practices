package problems2;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int grid[][]= {{3 ,0 ,6, 5 ,0 ,8 ,4, 0, 0},{5, 2, 0, 0 ,0, 0 ,0, 0, 0},{0 ,8 ,7, 0 ,0 ,0 ,0, 3, 1},{0 ,0 ,3 ,0 ,1, 0 ,0 ,8 ,0},{9 ,0 ,0, 8 ,6 ,3 ,0, 0 ,5},{0 ,5 ,0 ,0, 9 ,0, 6 ,0, 0},{1 ,3 ,0 ,0 ,0 ,0 ,2 ,5, 0},{0 ,0 ,0 ,0 ,0 ,0 ,0 ,7 ,4},{0 ,0 ,5 ,2 ,0 ,6 ,3, 0 ,0}};
        
        boolean yes=suduku(grid);
	}

	
	 static boolean suduku(int grid[][]) {
		 int row=-1;
		 int col=-1;
		 
		 boolean isEmpty=false;
		 
		 for(int i=0;i<grid.length;i++) {
			 for(int j=0;j<grid.length;j++) {
				 if(grid[i][j]==0) {
					 row=i;
					 col=j;
					 isEmpty=true;
					 break;
				 }
			 }
			 if(isEmpty==true) {
				 break;
			 }
		 }
		 
		if(isEmpty==false) {
			return true;
		}
		
		for(int i=1;i<=9;i++) {
			if(isSafe(grid,row,col,i)) {
				grid[row][col]=i;
				if(suduku(grid)) {
					printGrid(grid);
				}
				grid[row][col]=0;
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
	 static boolean isSafe(int[][] grid,int row,int col,int num) {
		 
		 for(int i=0;i<grid.length;i++) {
			 if(grid[row][i]==num) {
				 return false;
			 }
		 }
		 
		 for(int i=0;i<grid.length;i++) {
			 if(grid[i][col]==num) {
				 return false;
			 }
		 }
		 
		 int sqrt=(int)Math.sqrt(grid.length);
		 int rowStart=row-row%sqrt;
		 int colStart=col-col%sqrt;
		 for(int i=rowStart;i<rowStart+sqrt;i++) {
			 for(int j=colStart;j<colStart+sqrt;j++) {
				 if(grid[i][j]==num) {
					 return false;
				 }
			 }
		 }
		 
		 return true;
	 }
}
