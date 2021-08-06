package problems;
import java.util.*;
import java.io.*;
public class mergeArrayZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter ascending order array's size:");
      int n=sc.nextInt();
      System.out.println("Enter descending order array's size:");
      int m=sc.nextInt();
      int arrAsc[]=new int[n];
      int arrDes[]=new int[m];
      System.out.println("Enter ascending order array elements:");
      for(int i=0;i<n;i++) {
    	  arrAsc[i]=sc.nextInt();
      }
      
      System.out.println("Enter descending order array elements:");
      for(int i=0;i<n;i++) {
    	  arrDes[i]=sc.nextInt();
      }
      
//     mergeArray(arrAsc,arrDes);
      int ans[]=new int[arrAsc.length+arrDes.length];
		 int index=0;
		 int i=0,j=arrDes.length-1;
		 while(i<arrAsc.length&&j>=0) {
			 if(arrAsc[i]<arrDes[j]) {
				 ans[index]=((index==0||ans[index-1]!=arrAsc[i]))?arrAsc[i++]:arrDes[j--];
				
				 index++;
				 System.out.println(i+" "+j);
				 
			 }
			 else if(arrAsc[i]>arrDes[j]) {
				 
				 ans[index]=(index==0||ans[index-1]!=arrDes[j])?arrDes[j--]:arrAsc[i++];
				 
				 index++;
				 System.out.println(i+" "+j);
			 }
			 else if(ans[index-1]!=arrAsc[i]) {
				 ans[index++]=arrAsc[i];
				 i++;
				 j--;
				 
				 System.out.println(i+" "+j);
			 }
			 else {
				 i++;
				 j--; 
			 }
		 }
		
		 while(i<arrAsc.length) {
			 ans[index++]=arrAsc[i];
			 i++;
		 }
		 
		 while(j>=0) {
			 ans[index++]=arrAsc[j];
			 j--;
		 }
		
		 for(i=0;i<index;i++) {
	    	 System.out.print(ans[i]+" ");
	      }
      
	}
	
	static void mergeArray(int[] arrAsc,int[] arrDes) {
		
	}
	

}
