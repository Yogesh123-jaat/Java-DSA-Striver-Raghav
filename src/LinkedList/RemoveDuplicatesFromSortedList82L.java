package LinkedList;

public class RemoveDuplicatesFromSortedList82L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node deleteDuplicates(Node head) 
	{
		Node dummy = new Node(-1);
		Node t = dummy;
		
		Node i = head;
		
		while(i != null)
		{
			if(i.next == null || i.val != i.next.val)
			{
				t.next = i;
				t = i;
				i = i.next;
			}
			else
			{
				Node j = i.next;
				while(j != null && i.val == j.val)
				{
					j = j.next;
				}
				i = j;
			}
		}
		
		t.next = i;
		return dummy.next;
	}
}
