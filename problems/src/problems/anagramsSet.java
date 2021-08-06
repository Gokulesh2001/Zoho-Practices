package problems;
import java.io.*;
import java.util.*;

public class anagramsSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		int max=0;
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			max=Math.max(max, map.getOrDefault(sort(arr[i]),0)+1);
			map.put(sort(arr[i]), map.getOrDefault(sort(arr[i]),0)+1);
		}
		
		ArrayList<ArrayList<String>> list=new ArrayList<>();
		
		for(int i=0;i<max;i++) {
			ArrayList<String> temp=new ArrayList<String>();
			list.add(temp);
		}
		
		for(int i=0;i<n;i++) {
			String temp=sort(arr[i]);
			int index=map.get(temp);
			list.get(index-1).add(arr[i]);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println("The elements of "+(i+1));
			for(int j=0;j<list.get(i).size();j++) {
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
	
	static String sort(String str) {
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
