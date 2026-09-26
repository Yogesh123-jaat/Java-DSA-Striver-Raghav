package LinkedList2;

public class PartitionALinkedListAroundAGivenValue
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node partition(Node head, int x) 
	{
		Node d1 = new Node(-1);
		Node d2 = new Node(-1);
		
		Node t1 = d1;
		Node t2 = d2;
		
		Node t = head;
		
		while(t != null)
		{
			if(t.val < x)
			{
				t1.next = t;
				t1 = t1.next;
			}
			else
			{
				t2.next = t;
				t2 = t2.next;
			}
			
			t = t.next;
		}
		
		t1.next = null;
		t2.next = null;
		
		t1.next = d2.next;
		
		return d1.next;
	}
}
