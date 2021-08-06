package problems2;
/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	 @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
//        int n = sc.nextInt();
//        sc.nextLine();
//        String str = "";
//        
//        for(int i = 0; i < n; i++)
//        {
//        	str += sc.nextLine();
//        }
//        
//        int arr[] = new int[256];
//        
//        for(char c:str.toCharArray())
//        {
//        	arr[c]++;
//        }
//        ArrayList<Character> list1 = new ArrayList<Character>();
//        ArrayList<Character> list2 = new ArrayList<Character>();
//        
//        for(char c:str.toCharArray())
//        {
//        	if(arr[c] >= 2)
//        	{
//        		list1.add(c);
//        		arr[c] -= 2;
//        	}
//        	else if(arr[c] == 1)
//        	{
//        		list2.add(c);
//        	}
//        }
//        
//        Collections.sort(list1);
//        Collections.sort(list2);
//        String ans = "";
//        for(char c:list1)
//        {
//        	ans +=c;
//        }
//        
//        ans += list2.get(0);
//        Collections.reverse(list1);
//        for(char c:list1)
//        {
//        	ans +=c;
//        }
//        System.out.println(ans);
//        String str = "4:5:6";
//        String[] ch = str.split(":");
//        date.setHours(ch[0].charAt(0)-'0');
//        date.setMinutes(ch[1].charAt(0)-'0');
//        date.setSeconds(ch[2].charAt(0)-'0');
        
        System.out.println(date.getMonth()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
              
    }
    
}