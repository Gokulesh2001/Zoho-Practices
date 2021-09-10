package problems;

import java.util.Scanner;

public class passwordStrengthZoho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String password = sc.nextLine();
		int points = 0;
		
		if(password.length() > 5)
		{
			points += 20;
		}
		else
		{
			points += 10;
		}
		for(int i = 0; i < password.length();)
		{
			int consecutive = 0;
			if( password.charAt(i) >= '0' &&  password.charAt(i) <= '9')
			{
				
//				char c = password.charAt(i);
				while(i < password.length() && password.charAt(i) >= '0' &&  password.charAt(i) <= '9')
				{
					consecutive++;
					i++;
				}
				
				if(consecutive > 1)
				{
					points += 10;
				}
				else
				{
					points += 20;
				}
			}
			else if(password.charAt(i) >= 'a' &&  password.charAt(i) <= 'z' || password.charAt(i) >= 'A' &&  password.charAt(i) <= 'Z')
			{
				char c = password.charAt(i);
				while(i < password.length() && (password.charAt(i) >= 'A' &&  password.charAt(i) <= 'Z' || password.charAt(i) >= 'a' &&  password.charAt(i) <= 'z') )
				{
					consecutive++;
					i++;
				}
				
				if(consecutive > 1 )
				{
					points += 10;
				}
				else if(c >='a' && c <= 'z')
				{
					points += 10;
				}
				else
				{
					points += 15;
				}
				 		
			}
			
			else
			{
				points += 25;
				i++;
			}
		}
     System.out.println(points);
	}

}


