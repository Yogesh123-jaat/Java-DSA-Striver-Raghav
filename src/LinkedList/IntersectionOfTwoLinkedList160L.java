package LinkedList;

public class IntersectionOfTwoLinkedList160L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node getIntersectionNode(Node headA , Node headB) 
	{
		Node tempA = headA;
		Node tempB = headB;
		
		int lengthA = 0;
		int lengthB = 0;
		
		while(tempA != null)
		{
			lengthA++;
			tempA = tempA.next;
		}
		
		while(tempB != null)
		{
			lengthB++;
			tempB = tempB.next;
		}
		
		tempA = headA;
		tempB = headB;
		
		int n = lengthA - lengthB;
		
		if(n < 0) n = -n;
		
		if(lengthA > lengthB)
		{
			for(int i = 0; i < n; i++)
			{
				tempA = tempA.next;
			}
		}
		else
		{
			for(int i = 0; i < n; i++)
			{
				tempB = tempB.next;
			}
		}
		
		while(tempA != tempB)
		{
			tempA = tempA.next;
			tempB = tempB.next;
		}
		
		return tempA;
	}
}
