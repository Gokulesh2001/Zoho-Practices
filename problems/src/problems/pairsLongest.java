package problems;
import java.util.*;
import java.io.*;
class pairs{
	int a;
	int b;
	pairs(int a,int b){
		this.a=a;
		this.b=b;
	}
}
public class pairsLongest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int[][] arr= {{20,30},{12,20},{2,10},{15,25},{25,40},{40,60}};
		int n=3;
		
		pairs arrPair[]=new pairs[arr.length];
		for(int i=0;i<arr.length;i++) {
			
			arrPair[i]=new pairs(arr[i][0],arr[i][1]);
		}
			sort(arrPair);
			
			int dp[]=new int[arr.length];
			
			for(int i=0;i<dp.length;i++) {
				dp[i]=1;
			}
			
			ArrayList<ArrayList<Integer>> list=new ArrayList<>();
			
			for(int i=0;i<arr.length;i++) {
				ArrayList<Integer> temp=new ArrayList<Integer>();
				temp.add(i);
				
				list.add(temp);
			}
			int max=1;
			for(int i=1;i<arr.length;i++) {
				for(int j=0;j<i;j++) {
					if(arrPair[j].b<=arrPair[i].a&&dp[i]<dp[j]+1) {
						
						
						dp[i]=dp[j]+1;
						max=Math.max(max, dp[i]);
					}
				}
				
			}
			
			
			
			for(int i=1;i<arr.length;i++) {
				for(int j=0;j<i;j++) {
					if(arrPair[j].b<=arrPair[i].a&&(list.get(i).size()<=list.get(j).size()+1)) {
						
						list.get(i).clear();
						for(int k=0;k<list.get(j).size();k++) {
							list.get(i).add(list.get(j).get(k));
						}
						
						list.get(i).add(i);
						
						if(list.get(i).size()==max) {
							for(int p=0;p<max;p++) {
								
			             System.out.print(arrPair[list.get(i).get(p)].a+" "+arrPair[list.get(i).get(p)].b+" ");
							}
							System.out.println();
						}

						
					}
				}
				
			}
			
		}
		
	
	static void sort(pairs[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].a>arr[j+1].a) {
					pairs temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
