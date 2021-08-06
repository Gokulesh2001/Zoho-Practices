package problems;
import java.io.*;
import java.util.*;
public class reverseZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter k:");
        int k=sc.nextInt();
        
        //reversing each k set of elements
        for(int i=0;i<n;i+=k) {
        	reverse(arr,i,min(i+k-1,n-1));
        }
        System.out.println("The array elements are");
        for(int i=0;i<n;i++) {
        	 System.out.print(arr[i]+" ");
        }
	}
	
	//reverse function
	static void reverse(int arr[],int i,int j) {
		while(i<j) {
			
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	//min function
	static int min(int i,int j) {
		return i>j?j:i;
	}

}
