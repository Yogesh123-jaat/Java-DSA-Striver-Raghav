package LinkedList;

public class FirstNodeofLoopinLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int cycleStart(Node head) 
	{
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) break;
		}
		
		if(fast == null || fast.next == null) return -1;
		
		Node b = head;
		while(b != slow)
		{
			b = b.next;
			slow = slow.next;
		}
		
		return b.val;
	}
}