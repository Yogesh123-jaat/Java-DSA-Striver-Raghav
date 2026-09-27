package LinkedList2;

public class ReverseASubListOfALinkedListOptimalAproach 
{
	public static void main(String[] args) 
	{
		
	}
	
	static void reverse(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node fwd = null;
		
		while(curr != null)
		{
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
	}
	
	static Node reverseBetween(int l, int r, Node head) 
	{
		Node dummy = new Node(-1);
		Node temp = dummy;
		dummy.next = head;
		
		for(int i = 0; i < l - 1; i++)
		{
			temp = temp.next;
		}
		
		Node tail1 = temp;
		Node head2 = tail1.next;
		
		for(int i = 0; i < r - l + 1; i++)
		{
			temp = temp.next;
		}
		
		Node tail2 = temp;
		Node head3 = tail2.next;
		
		tail1.next = null;
		tail2.next = null;
		
		reverse(head2);
		
		tail1.next = tail2;
		head2.next = head3;
		
		return dummy.next;
	}
}
