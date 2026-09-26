package LinkedList2;

import java.util.ArrayList;

public class PalindromeLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static boolean palindrome(Node head)
	{
		Node temp = head;
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(temp != null)
		{
			arr.add(temp.val);
			temp = temp.next;
		}
		
		int i = 0; 
		int j = arr.size() - 1;
		
		while(i < j)
		{
			int a = arr.get(i);
			int b = arr.get(j);
			if(a != b) return false;
			
			i++;
			j--;
		}
		
		return true;
	}
}
