package problems;

import java.io.*;
import java.util.*;

public class stringReverse {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String 1 :");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2 :");
		String str2=sc.nextLine();
		String arr[]=new String[100];
		String temp="";
		int index=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=' ') {
				temp+=str1.charAt(i);
			}
			else {
				arr[index++]=temp;
				temp="";
			}
		}
		arr[index++]=temp;
		int begin=-1;
		for(int i=0;i<index;i++) {
			if(check(arr[i],str2)) {
				begin=i;
				break;
			}
		}
		reverse(arr,begin,index-1);
		int i;
		for( i=0;i<index;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	static boolean check(String a,String b) {
		
		int dp[][]=new int[a.length()+1][b.length()+1];
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=a.length();i++) {
			for(int j=1;j<=b.length();j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
					max=Math.max(max,dp[i][j] );
				}
			}
		}
		
		return max==b.length();
		
	}
	
	static void reverse(String arr[],int i,int j) {
		while(i<j) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
