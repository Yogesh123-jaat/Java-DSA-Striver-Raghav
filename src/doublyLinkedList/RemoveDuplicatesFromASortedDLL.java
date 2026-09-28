package doublyLinkedList;

public class RemoveDuplicatesFromASortedDLL 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static ListNode removeDuplicates(ListNode head)
	{
		if(head == null || head.next == null) return head;
		
		ListNode temp1 = head;
		ListNode temp2 = head.next;
		
		while(temp2 != null)
		{
			if(temp1.val == temp2.val)
			{
				temp1.next = temp2.next;
				if(temp2.next != null) temp2.next.prev = temp1;
				
				temp2 = temp1.next;
			}
			else
			{
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		
		return head;
	}
}
