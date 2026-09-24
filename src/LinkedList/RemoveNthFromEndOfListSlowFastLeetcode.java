package LinkedList;

public class RemoveNthFromEndOfListSlowFastLeetcode 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node removeNthFromLast(Node head , int k)
	{
		Node slow = head;
		Node fast = head;
		Node prev = null;
		
		for(int i = 0; i < k; i++)
		{
			fast = fast.next;
		}
		
		if(fast == null) return head.next;
		
		while(fast != null)
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next;
		}
		
		prev.next = slow.next;
		
		return head;
	}
}
