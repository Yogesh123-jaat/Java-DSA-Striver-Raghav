package doublyLinkedList;

public class RotateDoublyLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public ListNode rotateDLL(ListNode head, int k) 
    {
        if(head.next == null) return head;
        
        ListNode tail = head;
        ListNode temp = head;
        int length = 1;
        
        while(tail.next != null)
        {
            tail = tail.next;
            length++;    
        }
        
        k = k % length;
        
        while(k > 0)
        {
            head = head.next;
            head.prev = null;
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            tail.next = null;
            
            temp = head;
            k--;
        }
        
        return head;
    }
}
