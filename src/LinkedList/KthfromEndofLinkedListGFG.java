package LinkedList;

public class KthfromEndofLinkedListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int getKthFromLast(Node head , int k)
	{
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			length++;
			temp = temp.next;
		}
		
		if(k > length) return -1;
		temp = head;
		for(int i = 0; i < length - k; i++)
		{
			temp = temp.next;
		}
		
		return temp.val;
	}
}
