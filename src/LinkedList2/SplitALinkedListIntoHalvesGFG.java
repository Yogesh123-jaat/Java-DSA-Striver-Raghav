package LinkedList2;

class Pair
{
	Node a;
	Node b;
	
	Pair(Node a , Node b)
	{
		this.a = a;
		this.b = b;
	}
}
public class SplitALinkedListIntoHalvesGFG 
{
	public static void main(String[] args) 
	{
		
	}
	public Pair splitList(Node head) 
    {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        
        while(temp.next != head)
        {
            temp = temp.next;
        }
        
        temp.next = null;
        
        
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node b = slow.next;
        slow.next = head;
        
        temp.next = b;
        
        Pair ans = new Pair(head , b);
        
        return ans;
    }
}
