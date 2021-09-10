package problems;

import java.util.Scanner;

public class lastCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i = 0; i < n; i++)
    {
    	for(int j = 0; j < n; j++)
    	{
    		arr[i][j] = sc.nextInt();
    	}
    }
    
    System.out.println(isReachable(0,0,arr,n)?"Yes":"No");
    
	}
	static boolean isReachable(int i, int j, int[][] arr, int n)
	{
		if(i >= n || j >= n)
		{
			return false;
		}
		if(i == n-1 && j == n-1 && arr[i][j] == 1)
		{
			return true;
		}
		if(arr[i][j] == 0)
		{
			return false;
		}
		
		return isReachable(i+1,j,arr,n) || isReachable(i,j+1,arr,n);
	}

}
