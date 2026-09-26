package LinkedList2;

public class SwapNodesInPairs24LByYogesh 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node oddEvenList(Node head)
	{
		Node temp = head;
		int len = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			len++;
		}
		
		int n = len;
		
		Node d1 = new Node(-1);
		Node d2 = new Node(-1);
		
		Node t1 = d1;
		Node t2 = d2;
		
		Node t = head;
		len = 1;
		
		while(t != null)
		{
			if(len > n) break;
			
			if(len % 2 != 0)
			{
				t1.next = t;
				t1 = t;
			}
			else
			{
				t2.next = t;
				t2 = t;
			}
			t = t.next;
			len++;
		}
		
		t1.next = null;
		t2.next = null;
		
		d1 = d1.next;
		d2 = d2.next;
		
		Node d3 = new Node(-1);
		Node fin = d3;
		
		while(d1 != null && d2 != null)
		{
			d3.next = d2;
			d2 = d2.next;
			d3 = d3.next;
			d3.next = d1;
			d1 = d1.next;
			d3 = d3.next;
		}
		
		if(d1 == null) d3.next = d2;
		else d3.next = d1;
		
		return fin.next;
	}
	
	public static Node swapPairs(Node head) 
	{
		if(head == null || head.next == null) return head;
		
		return oddEvenList(head);
	}
}
