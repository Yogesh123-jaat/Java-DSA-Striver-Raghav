package doublyLinkedList;

public class ReverseDoublyLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static ListNode reverse(ListNode head)
	{
		ListNode curr = head;
		ListNode pre = null;
		ListNode fwd = null;
		
		while(curr != null)
		{
			fwd = curr.next;
			curr.next = pre;
			curr.prev = fwd;
			pre = curr;
			curr = fwd;
		}
		
		return pre;
	}
}
