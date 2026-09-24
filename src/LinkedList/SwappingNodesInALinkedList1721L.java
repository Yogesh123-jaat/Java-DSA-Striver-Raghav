package LinkedList;

public class SwappingNodesInALinkedList1721L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node swapNodes(Node head, int k) 
	{
		Node first = head;
		Node second = head;
		int length = 0;
		
		while(second != null)
		{
			second = second.next;
			length++;
		}
		
		second = head;
		
		for(int i = 0; i < k - 1; i++)
		{
			first = first.next;
		}
		
		for(int i = 0; i < length - k; i++)
		{
			second = second.next;
		}
		
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
		
		return head;
	}
}
