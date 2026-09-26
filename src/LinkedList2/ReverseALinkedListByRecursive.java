package LinkedList2;

public class ReverseALinkedListByRecursive 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node reverse(Node head)
	{
		if(head == null || head.next == null) return head;
		Node a = head.next;
		head.next = null;
		
		Node b = reverse(a);
		a.next = head;
		return b;
	}
}
