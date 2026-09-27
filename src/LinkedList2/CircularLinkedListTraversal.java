package LinkedList2;

public class CircularLinkedListTraversal
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void print(Node head)
	{
		System.out.print(head.val + " ");
		Node temp = head.next;
		
		while(temp != head)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	public static void printList(Node head) 
	{
		 Node temp = head;
		 
		 while(temp.next != null)
		 {
			 System.out.print(temp.val + " ");
			 temp = temp.next;
		 }
		 
		 System.out.print(temp.val + " ");
	}
}
