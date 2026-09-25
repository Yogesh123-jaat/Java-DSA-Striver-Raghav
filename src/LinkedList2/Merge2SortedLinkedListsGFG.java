package LinkedList2;

public class Merge2SortedLinkedListsGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node sortedMerge(Node head1, Node head2) 
	{
		Node dummy = new Node(-1);
		Node k = dummy;
		Node i = head1;
		Node j = head2;
		
		while(i != null && j != null)
		{
			if(i.val < j.val)
			{
				k.next = i;
				i = i.next;
			}
			else
			{
				k.next = j;
				j = j.next;
			}
			
			k = k.next;
		}
		
		if(i == null) k.next = j;
		else k.next = i;
		
		return dummy.next;
	}
}
