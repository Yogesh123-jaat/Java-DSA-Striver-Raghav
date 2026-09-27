package LinkedList2;

public class AddNumberLinkedList 
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
    public Node addTwoLists(Node head1, Node head2) 
    {
        while(head1.val == 0)
        {
            head1 = head1.next;
            if(head1 == null) break;
        }
        
        while(head2.val == 0)
        {
            head2 = head2.next;
            if(head2 == null) break;
        }
        
        if(head1 == null && head2 == null) 
        {
            Node a = new Node(0);
            return a;
        }
        Node dummy = new Node(-1);
        Node t = dummy;
        Node temp1 = reverse(head1);
        Node temp2 = reverse(head2);
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        
        while(temp1 != null || temp2 != null)
        {
            if(temp1 != null) val1 = temp1.val;
            else val1 = 0;
            
            if(temp2 != null) val2 = temp2.val;
            else val2 = 0;
            
            int sum = val1 + val2 + carry;
            if(sum > 9) carry = 1;
            else carry = 0;

            Node a = new Node(sum % 10);
            
            t.next = a;
            t = t.next;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        
        if(carry == 1) 
        {
            if(temp1 != null) val1 = temp1.val;
            else val1 = 0;
            
            if(temp2 != null) val2 = temp2.val;
            else val2 = 0;
            
            int sum = val1 + val2 + carry;
            Node a = new Node(sum % 10);
            t.next = a;
            t = t.next;
        }
        
        t.next = null;
        
        t = reverse(dummy.next);
        
        return t;
    }
}
