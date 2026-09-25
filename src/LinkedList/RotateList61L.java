package LinkedList;

public class RotateList61L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int length(Node head)
	{
		int len = 0;
		Node temp = head;
		
		while(temp != null)
		{
			len++;
			temp = temp.next;
		}
		
		return len;
	}
	public Node rotateRight(Node head, int k) 
	{
		if(head == null || head.next == null) return head;
		
		int n = length(head);
		
		k %= n;
		if(k == 0) return head;
		
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i < k+1; i++)
		{
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		Node a = slow.next;
		slow.next = null;
		
		Node tail = a;
		
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		tail.next = head;
		
		return a;
	}
}
