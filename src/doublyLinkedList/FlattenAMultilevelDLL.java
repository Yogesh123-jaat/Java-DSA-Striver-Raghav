package doublyLinkedList;

public class FlattenAMultilevelDLL 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static ListNode flatten(ListNode head)
	{
		if(head == null) return null;
		
		ListNode curr = head;
		
		while(curr != null)
		{
			if(curr.child == null) curr = curr.next;
			else
			{
				ListNode fwd = curr.next;
				ListNode c = flatten(curr.child);
				curr.child = null;
				curr.next = c;
				c.prev = curr;
				
				ListNode temp = c;
				while(temp.next != null) temp = temp.next;
				temp.next = fwd;
				if(fwd != null) fwd.prev = temp;
				curr = fwd;
			}
		}
		
		return head;
	}
}
