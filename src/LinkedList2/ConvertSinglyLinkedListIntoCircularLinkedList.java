package LinkedList2;

public class ConvertSinglyLinkedListIntoCircularLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void convert(Node head)
	{
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = head;
	}
}
