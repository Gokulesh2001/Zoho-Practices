package problems;
import java.io.*;
import java.util.*;

public class matrixPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		int[][] mat= {{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5}};
		char dir[]= {'>','>','>','v','v'};
		
		printPath(mat,dir,0,1,0);
	}
	
	static void printPath(int[][] mat,char dir[],int i,int j,int index) {
		if(i<0||i>=mat.length||j<0||j>=mat.length||index>=dir.length) {
			return;
		}

		System.out.print(mat[i][j]+" ");
		
		if(dir[index]=='>') {
			printPath(mat,dir,i,j+1,index+1);
		}
		else if(dir[index]=='v') {
			printPath(mat,dir,i+1,j,index+1);
		}
		else if(dir[index]=='^'){
			printPath(mat,dir,i-1,j,index+1);
		}
		else {
			printPath(mat,dir,i,j-1,index+1);
		}
	}

}
