package problems2;

public class recursionZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5};
		
		
		recursion(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void recursion(int[] arr,int index) {
		if(index==1) {
			
			return;
		}
		
		
		
		
		int[] temp=new int[index-1];
		int t=0;
		for(int i=0;i+1<arr.length;i++) {
			temp[t++]=arr[i]+arr[i+1];
		}
		recursion(temp,temp.length);
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
		System.out.println();
	}

}
