package LinkedList;

public class RemoveDuplicatesFromSortedList
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node deleteDuplicates(Node head) 
	{
		if(head == null) return head;
		
		Node i = head;
		Node j = head;
		
		while(j != null)
		{
			if(i.val == j.val)
			{
				j = j.next;
			}
			else
			{
				i = i.next;
				i = j;
			}
		}
		
		i.next = j;
		return head;
	}
}
