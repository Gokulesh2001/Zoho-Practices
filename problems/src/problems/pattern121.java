package problems;

import java.util.Scanner;

public class pattern121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int num,r,c,sp;
		 System.out.println("Enter number of rows : ");
		   num = sc.nextInt();
		    for(r=1; r<=num; r++)
		        {
		           
		            for(c=1; c<=r; c++)
		            	 System.out.print(c);
		            for(c=r-1; c>=1; c--)
		            	 System.out.print(c);
		            System.out.println();
		        }
		    for(r=1; r<=num; r++)
		        {
		           
		            for(c=1; c<=(num-r); c++)
		            	 System.out.print(c);
		            for(c=num-r-1; c>=1; c--)
		            	 System.out.print(c);
		            System.out.println();
		        }
	}

}
