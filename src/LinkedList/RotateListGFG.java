package LinkedList;

public class RotateListGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public int length(Node head)
    {
        int len = 0;
        Node temp = head;
        
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        
        return len;
    }
    public Node rotate(Node head, int k) 
    {
        if(head == null || head.next == null) return head;
        
        int n = length(head);
        k = k % n;
        
        if(k == 0) return head;
        
        Node a = head;
        Node b = head;
        Node prev = null;
        
        for(int i = 0; i < k; i++)
        {
            prev = b;
            b = b.next;
        }
        
        prev.next = null;
        
        Node tail = b;
        
        while(tail.next != null)
        {
            tail = tail.next; 
        }
        
        tail.next = a;
        
        return b;   
    }
}
