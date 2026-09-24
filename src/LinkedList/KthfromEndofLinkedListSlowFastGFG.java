package LinkedList;

public class KthfromEndofLinkedListSlowFastGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int kThFromLast(Node head , int k)
	{
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i < k; i++)
		{
			if(fast == null) return -1; // ye line next se pahle hi likhni hai because k == list.size()
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.val;
	}
}