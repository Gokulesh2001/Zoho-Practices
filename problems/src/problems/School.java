package problems;
import java.io.*;
import java.util.*;
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the number of students and lockers:");
         int n=sc.nextInt();
         
         boolean lockers[]=new boolean[n];
        
         for(int i=1;i<=n;i++) {
        	 for(int j=i;j<=n;j+=i) {
        		 if(lockers[j-1]==true) {
        			 lockers[j-1]=false;
        		 }
        		 else {
        			 lockers[j-1]=true; 
        		 }
        	 }
         }
         System.out.println("Closed doors:");
         for(int i=1;i<=n;i++) {
        	 if(lockers[i-1]==false)
        	 System.out.print(i+" ");
         }
         System.out.println();
         System.out.println("Opened doors:");
         for(int i=1;i<=n;i++) {
        	 if(lockers[i-1]==true)
        	 System.out.print(i+" ");
         }
	}

}
