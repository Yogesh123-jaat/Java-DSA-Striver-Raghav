package LinkedList;

public class RemoveNthFromEndOfList 
{
	public static void main(String[] args) 
	{
		Node a = new Node(10); 
		Node b = new Node(20); 
		Node c = new Node(30); 
		Node d = new Node(40); 
		Node e = new Node(50); 
		Node f = new Node(60); 
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = null;
		
		Node temp = removeNthFromEnd(a,6);
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	public static Node removeNthFromEnd(Node head , int k)
	{
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		
		if(length == k) return head.next;
		
		temp = head;
		
		if(length < k)
		{
			System.out.println("linked list is small than k.");
			return null;
		}
		if(length == k) return head.next;
		
		for(int i = 0; i < length - k - 1; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		return head;
		
	}
}