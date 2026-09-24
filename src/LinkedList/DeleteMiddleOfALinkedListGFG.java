package LinkedList;

public class DeleteMiddleOfALinkedListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node delteMiddle(Node head)
	{
		if(head == null || head.next == null) return null;
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		temp = head;
		
		for(int i = 0; i < length/2 - 1; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		return head;
	}
}
