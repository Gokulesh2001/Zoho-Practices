package problems2;
import java.util.*;
public class spoonZoho {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	String str=sc.nextLine();
	String str2=sc.nextLine();
	char[] arr=str.toCharArray();
	char[] arr2=str2.toCharArray();
	boolean ok=true;
	int j=0;
	for(int i=0;i<arr2.length;) {
		if(arr[i]!=arr2[j] && arr2[j]=='*') {
			arr[i]='*';
			i++;
			j++;
		}
		else if(i>0 && arr[i]!=arr2[j] && arr[i-1]=='*') {
			arr[i]='*';
			i++;
			
		}
		else if(arr[i]==arr2[j]) {
			i++;
			j++;
		}
		else {
			ok=false;
			break;
		}
	}
	System.out.println(ok);
	
	}
}
