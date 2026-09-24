package LinkedList;

public class SwappingNodesInALinkedListSlowFast1721L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node swapNodes(Node head, int k)
	{
		Node slow = head;
		Node fast = head;
		
		
		for(int i = 0; i < k; i++)
		{
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		fast = head;
		
		for(int i = 0; i < k - 1; i++)
		{
			fast = fast.next;
		}
		
		int temp = slow.val;
		slow.val = fast.val;
		fast.val = temp;
		
		return head;
	}
    
}
