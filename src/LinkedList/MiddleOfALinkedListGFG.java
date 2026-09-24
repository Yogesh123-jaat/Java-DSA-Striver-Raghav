package LinkedList;

public class MiddleOfALinkedListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	int middleNode(Node head)
	{
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			length++;
			temp = temp.next;
		}
		
		temp = head;
		
		for(int i = 0; i < length/2; i++)
		{
			temp = temp.next;
		}
		
		return temp.val; 
	}
}
