package problems2;

public class kthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {7,3,4,5,6,2,1};
       
       heap h=new heap();
//       h.insertNewValue(arr[0]);
//       h.insertNewValue(arr[1]);
//       h.insertNewValue(arr[2]);
//       h.insertNewValue(arr[3]);
//       h.insertNewValue(arr[4]);
//       h.insertNewValue(arr[5]);
//       h.insertNewValue(arr[6]);
       h.buildHeap(arr);
       int n=arr.length;
       int k=3;
       int i=0;
       while(i<n-k) {
    	   h.removeMax();
    	   i++;
       }
       System.out.println(h.removeMax());
	}

}
