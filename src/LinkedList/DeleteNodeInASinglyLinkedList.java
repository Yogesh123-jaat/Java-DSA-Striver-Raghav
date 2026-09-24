package LinkedList;

public class DeleteNodeInASinglyLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	void delteNode(Node target)  // LeetCode 237
	{
		target.val = target.next.val;
		target.next = target.next.next;
	}
}
