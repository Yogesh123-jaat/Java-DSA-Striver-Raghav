package LinkedList2;

public class SwapNodesInPairs 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node swapPairs(Node head) 
    {
        if(head == null || head.next == null) return head;
        Node a = head;
        Node b = head.next;
        Node dummy = new Node(-1);
        Node c = dummy;

        while(a != null && b != null)
        {
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a != null) b = a.next;
        }

        return dummy.next;
    }
}
