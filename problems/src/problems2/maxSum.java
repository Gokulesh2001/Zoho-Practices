package problems2;

import java.util.*;

public class maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={25,-11,28,15,-10,30,11};
		int s=0;
		ArrayList<Integer> list=new ArrayList<>();
		int max_so_far=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
			if(max_so_far<s) {
				max_so_far=s;
			}
			if(s<0||arr[i]<0) {
				s=0;	
			}

		}
	   System.out.println(max_so_far);
	   int max=max_so_far;
	   max_so_far=Integer.MIN_VALUE;
	   
	   for(int i=0;i<arr.length;i++) {
			s+=arr[i];
			list.add(arr[i]);
			if(s==max) {
				break;
			}
			if(max_so_far<s) {
				max_so_far=s;
			}
			if(s<0||arr[i]<0) {
				s=0;	
				list.clear();
			}

		}
	   for(int i=0;i<list.size();i++) {
		   System.out.print(list.get(i)+" ");
	   }
	   
	   
	}

}
