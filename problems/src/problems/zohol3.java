package problems;


class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next=null;
	}
}

public class zohol3 {
  public static void main(String args[]) {
	     // 0 -> 1 -> 2
	  Node head = new Node(0);
	  Node curr = head;
	  head.next = new Node(1);
	  
	  
	  head = head.next;
	  
	  head.next = new Node(2);
	  head = head.next;
	  
	  head.next = new Node(3);
	  printList(curr);
  }
  
  static void printList(Node head)
  {
	  Node curr = head;
	  
	  while(curr != null)
	  {
		  System.out.print(curr.data+" ");
		  curr = curr.next;
	  }
  }
}
