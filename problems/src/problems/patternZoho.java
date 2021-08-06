package problems;
import java.io.*;
import java.util.*;
public class patternZoho {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the string:");
         String str=br.readLine();
         int n=str.length();
         int mid=str.length()/2;
         for(int i=0;i<n;i++) {
        	 int p=mid;
        	 for(int j=i;j<n;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=0;j<=i;j++) {
        		 System.out.print(str.charAt(p)); 
        		 if(p+1<n) {
        		 p++;
        		 }
        		 else {
        			p=0; 
        		 }
        	 }
        	 System.out.println();
         }
	}

}
