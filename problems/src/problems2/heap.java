package problems2;

public class heap {
   
	
	int size;
	int arr[]=new int[20];
	
	public void insertNewValue(int value) {
		arr[size]=value;
		int parent=(size-1)/2;
		int index=size;
		while(parent>=0 && arr[parent]<arr[index] ) {
			int temp=arr[parent];
			arr[parent]=arr[index];
			arr[index]=temp;
			temp=parent;
			 index=parent;
			parent=(temp-1)/2;
		}
		size++;
	}
	
	public int getMax() {
		return arr[0];
	}
	
	public int removeMax() {
		int max=arr[0];
		arr[0]=arr[size-1];
		size--;
		
		maxHeapify(0);
		return max;
	}
	
	public void maxHeapify(int index) {
		int left=(index*2)+1;
		int right=(index*2)+2;
		
		int largest=index; 
		
		if(left<this.size && arr[left]>arr[largest]) {
			largest=left;
		}
		
		if(right<this.size && arr[right]>arr[largest]) {
			largest=right;
		}
		
		if(largest!=index) {
			int temp=arr[largest];
			arr[largest]=arr[index];
			arr[index]=temp;
			maxHeapify(largest);
		}
		
	}
	
	void buildHeap(int[] arr) {
		this.size=arr.length;
		this.arr=arr;
		for(int i=size/2-1;i>=0;i--) {
			maxHeapify(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr= {10,7,11,30,20,2,45};
		heap h=new heap();
//		h.buildHeap(arr);
		h.insertNewValue(arr[0]);
		h.insertNewValue(arr[1]);
		h.insertNewValue(arr[2]);
		h.insertNewValue(arr[3]);
		h.insertNewValue(arr[4]);
		h.insertNewValue(arr[5]);
		h.insertNewValue(arr[6]);
		System.out.println(h.getMax());
		
	}

}
