package problems;

import java.util.Scanner;
import java.util.Stack;

public class alphabetOrderRemoval {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> st = new Stack<Character>();
		
		st.push('\0');
		for(char c:str.toCharArray())
		{
			if(Math.abs(st.peek()-c)!=1)
			{
				st.push(c);
			}
			else
			{
				st.pop();
			}
		}
		for(char c:st)
		{
			System.out.print(c);
		}
		
		
		
	}

}
