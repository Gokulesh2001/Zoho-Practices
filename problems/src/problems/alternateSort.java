package problems;

import java.util.Scanner;

public class alternateSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter size:");
	        
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter array elements:");
	        for(int i=0;i<n;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	        	if(i%2==0)
	        	{
	        		int max = arr[i];
	        		 for(int j=i+1;j<n;j++)
	     	        {
	        			 if(max < arr[j])
	        			 {
	        				 int temp = arr[j];
	        				 arr[j] = arr[i];
	        				 arr[i] = temp;
	        			 }
	     	        }
	        	}
	        	else
	        	{
	        		int min = arr[i];
	        		 for(int j=i+1;j<n;j++)
	     	        {
	        			 if(min > arr[j])
	        			 {
	        				 int temp = arr[j];
	        				 arr[j] = arr[i];
	        				 arr[i] = temp;
	        			 }
	     	        }
	        	}
	        }
	        for(int i=0;i<n;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	}

}
