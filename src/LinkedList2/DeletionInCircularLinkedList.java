package LinkedList2;

public class DeletionInCircularLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	static Node deleteNode(Node head, int key) 
	{
		Node tail = head;
		while(tail.next != head)
		{
			tail = tail.next;
		}
		tail.next = null;
		
		if(head.val == key)
		{
			head = head.next;
			tail.next = head;
			return head;
		}
		
		Node temp = head;
		Node temp2 = head.next;
		
		while(temp2 != null)
		{
			if(temp2.val == key)
			{
				if(temp2 == tail)
				{
					temp.next = null;
					tail = temp;
				}
				else
				{
					temp.next = temp2.next;
				}
				break;
			}
			
			temp = temp.next;
			temp2 = temp2.next;
		}
		
		tail.next = head;
		
		return head;
	}
}