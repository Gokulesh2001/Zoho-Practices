package problems2;
import java.util.*;
public class valueOfStringZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int arr[]=new int[26];
		for(char c:str.toCharArray()) {
			arr[c-'a']++;
		}
       
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=(i+1)*arr[i];
		}
		System.out.println(sum);
	}

}
