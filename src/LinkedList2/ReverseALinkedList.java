package LinkedList2;

import java.util.ArrayList;

public class ReverseALinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node reverseList(Node head)  // TC : O(n) SC : O(n) 
	{
		Node temp = head;
		ArrayList<Node> arr = new ArrayList<>();
		
		while(temp != null)
		{
			arr.add(temp);
			temp = temp.next;
		}
		
		int n = arr.size();
		for(int i = n - 1; i >= 1; i--)
		{
			arr.get(i).next = arr.get(i-1);
		}
		
		arr.get(0).next = null;
		
		return  arr.get(n-1);
	}
}
