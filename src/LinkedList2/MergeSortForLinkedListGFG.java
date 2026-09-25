package LinkedList2;

public class MergeSortForLinkedListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node merge(Node head1 , Node head2)
	{
		Node i = head1;
		Node j = head2;
		
		Node dummy = new Node(-1);
		Node k = dummy;
		
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
	
	 public static Node mergeSort(Node head) 
	 {
		 if(head == null || head.next == null) return head;
		 
		 Node slow = head;
		 Node fast = head;
		 
		 while(fast.next != null && fast.next.next != null)
		 {
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 
		 Node head2 = slow.next;
		 slow.next = null;
		 
		 head = mergeSort(head);
		 head2 = mergeSort(head2);
		 
		 return merge(head , head2);
	 }
}
