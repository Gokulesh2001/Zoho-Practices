package problems2;
import java.util.*;

public class threeStringsZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s1[]=sc.nextLine().split(" ");
		String s2[]=sc.nextLine().split(" ");
		String s3[]=sc.nextLine().split(" ");
		HashMap<String,Integer> map1=new HashMap<>();
		HashMap<String,Integer> map2=new HashMap<>();
		HashMap<String,Integer> map3=new HashMap<>();
		
		for(String i:s1) {
			map1.put(i, map1.getOrDefault(i,0)+1);
		}
		for(String i:s2) {
			map2.put(i, map2.getOrDefault(i,0)+1);
		}
		for(String i:s3) {
			map3.put(i, map3.getOrDefault(i,0)+1);
		}
		
		for(String i:s1) {
			if(map1.getOrDefault(i,0)>=1 && map2.getOrDefault(i,0)>=1 && map3.getOrDefault(i,0)>=1) {
				System.out.print(i+" ");
				map1.put(i, map3.get(i)-1);
				map2.put(i, map3.get(i)-1);
				map3.put(i, map3.get(i)-1);
			}
		}
		
	}

}
