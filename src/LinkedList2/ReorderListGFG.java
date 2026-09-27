package LinkedList2;

public class ReorderListGFG 
{
	public static void main(String[] args) 													
	{
		
	}
	
	public Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        
        return prev;
    }
    public void reorderList(Node head) 
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node b = slow.next;
        Node a = head;
        slow.next = null;
        
        b = reverse(b);
        
        Node dummy = new Node(-1);
        Node t = dummy;
        
        while(a != null && b != null)
        {
            t.next = a;
            t = t.next;
            a = a.next;
            t.next = b;
            t = t.next;
            b = b.next;
        }
        
        if(a == null) t.next = b;
        else t.next = a;
        
        head = dummy.next;
    }
}
