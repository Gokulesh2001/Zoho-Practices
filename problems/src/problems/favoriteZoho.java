package problems;
import java.util.*;

public class favoriteZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter maximum length:");
     int m=sc.nextInt();
     System.out.println("Enter favorite character:");
     char favo=sc.next().charAt(0);
     
     
     System.out.println("Enter number of words:");
     int n=sc.nextInt();
     String[] arr=new String[n];
     sc.nextLine();
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextLine();
     }
     
     sort(arr,favo);
//     for(String i:arr) {
//    	 System.out.print(i+" ");
//     }
//     
     int i=0;
     String temp="";

     
     while(!isAllEmpty(arr) ) {
    	 
    	 temp="";
    	 for(i=0;i<n;i++) {
    		 if(!arr[i].equals("")) {
    			 if(count(temp+arr[i],favo)<=m) {
    	    		 temp+=arr[i];
//    	    		 System.out.print(temp);
    	    		 System.out.print(arr[i]+" ");
    	    		 arr[i]="";
    	    		
    	    		
    	    		
    	    	 }
    	    	 
    	    	 }
    	 }
//    	 if(i==n) {
//    		 temp="";
//    		 i=0;
//    		 System.out.println();
//    	 }
//    	 
//    	 
//    	
//    	 sort(arr,favo);
    	
    	 System.out.println();
    	 
     }
     
     
     
	}
	
	static boolean isAllEmpty(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("")==false) {
				return false;
			}
		}
		return true;
	}
	static void sort(String arr[],char favo) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(count(arr[j],favo)<count(arr[j+1],favo)) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static int count(String a,char favo) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=favo) {
				count++;
			}
		}
		return count;
	}

}

//twinkle
//twinkle
//little
//star
//how
//i
//wonder
//what
//you
//are