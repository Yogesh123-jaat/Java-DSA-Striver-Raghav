package LinkedList;

import java.util.ArrayList;


public class PalindromeLinkedList 
{
	public static void main(String[] args) 
	{
		Node a = new Node(1); 
		Node b = new Node(2);
		Node c = new Node(2);
		Node d = new Node(1);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		
		System.out.println(isPalindrome(a));
	}
	
	public static Node reverse(Node head)
	{
		ArrayList<Node> list = new ArrayList<>();
		Node temp = head;
		
		while(temp != null)
		{
			list.add(temp);
			temp = temp.next;
		}
		
		for(int i = list.size() - 1; i > 0; i--)
		{
			list.get(i).next = list.get(i-1);
		}
		
		list.get(0).next = null;
		
		return list.get(list.size() - 1);
		
//		Node prev = null;
//		Node curr = head;
//		Node fwd = null;
//		
//		while(curr != null)
//		{
//			fwd = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = fwd;
//		}
//		
//		return prev;
	}
	
	public static boolean isPalindrome(Node head)
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node head2 = slow.next;
		slow.next = null;
		
		head2 = reverse(head2);
		 
		Node i = head;
		Node j = head2;
		
		while(j != null)
		{
			if(i.val != j.val) return false;
			i = i.next;
			j = j.next;
		}
		return true;
	}
}
