package problems;
import java.io.*;
import java.util.*;



public class operatorsZoho {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string size:");
        
         int n=sc.nextInt();
        
         char[] str=new char[n];
         System.out.println("Enter the string :");
         
         for(int i=0;i<n;i++) {
        	 str[i]=sc.next().charAt(0);
         }
         
        
         char operators[]= {'*','-','+','/'};
         
         int operatorBegin=0;
         int i=0;
         while(!operatorsCheck(operators,str[i])) {
        	 operatorBegin++;
        	 i++;
         }
         i=0;
         int ans=Integer.parseInt(str[i]+"");
         i=1;
         while(operatorBegin<n) {
        	
        	
    		 int temp=Integer.parseInt(str[i++]+"");
        	 if(str[operatorBegin]=='+') {
        		
        		 ans+=temp;
        		 
        	 }
        	 else if(str[operatorBegin]=='-') {
        		 ans-=temp;
        	 }
        	 else if(str[operatorBegin]=='*'){
        		 ans*=temp;
        	 }
        	 else if(str[operatorBegin]=='/'){
        		 ans/=temp;
        	 }
        	 operatorBegin++;
         }
         System.out.println("Ans:"+ans);
	}
	
	static boolean operatorsCheck(char operators[],char c) {
		
		for(int i=0;i<operators.length;i++) {
			if(operators[i]==c) {
				return true;
			}
		}
		return false;
	}

}
