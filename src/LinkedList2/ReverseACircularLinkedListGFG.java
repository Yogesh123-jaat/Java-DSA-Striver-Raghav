package LinkedList2;

public class ReverseACircularLinkedListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public void reverse(Node head)
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
    }
    public Node reverseCircular(Node head) 
    {
        Node temp = head;
        
        while(temp.next != head)
        {
            temp = temp.next;
        }
        
        temp.next = null;
        
        reverse(head);
        
        head.next = temp;
        
        return temp;
    }
}
