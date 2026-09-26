package LinkedList2;

public class ReverseALinkedListBy3PointerApproach 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node revrese(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node fwd = null;
		
		while(curr != null)
		{
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		
		return prev;
	}
}
