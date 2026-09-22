package LinkedList;

public class DisplayList 
{
	public static void display(Node head)
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	
		System.out.println();
		
		for(temp = head; temp != null; temp = temp.next)
		{
			System.out.print(temp.val + " ");
		}
	}
	
	public static void displayRec(Node head)
	{
		if(head == null) return;
		
		System.out.print(head.val  + " ");
		displayRec(head.next);
	}
	
	public static int get(Node head , int idx)
	{
		Node temp = head;
		
		for(int i = 0; i < idx; i++)
		{
			head = head.next;
		}
		
		return head.val;
	}
	
	public static void main(String[] args) 
	{
		Node a = new Node(10); 
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50); 
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		display(a);
		System.out.println();
		displayRec(a);
		System.out.println();
		System.out.println(get(a,2));
	}
}
