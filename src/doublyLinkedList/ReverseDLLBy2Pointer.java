package doublyLinkedList;

public class ReverseDLLBy2Pointer
{
	public static void main(String[] args) 
	{
		
	}
	
	public static ListNode reverse(ListNode head)
	{
		if(head.next == null) return head;
		
		ListNode temp = null;
		ListNode curr = head;
		
		while(curr != null)
		{
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		
		return temp.prev;
	}
}
