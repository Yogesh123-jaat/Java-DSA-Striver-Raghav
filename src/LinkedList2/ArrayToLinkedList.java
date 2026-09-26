package LinkedList2;

public class ArrayToLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node addNode(int x)
    {
        Node temp = new Node(x);
        
        return temp;
    }
    public static Node arrayToList(int arr[]) 
    {
        Node temp = addNode(arr[0]);
        Node head = temp;
        
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = addNode(arr[i]);
            temp = temp.next;
        }
        
        return head;
    }
}
