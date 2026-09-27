package LinkedList2;

import java.util.ArrayList;

public class ReverseSublistOfALinkedLists 
{
	public static void main(String[] args) 
	{
		
	}
	
	 static Node reverseBetween(int a, int b, Node head)   // TC : O(n) SC : O(n) 
	 {
		 ArrayList<Node> arr = new ArrayList<>();
		 Node temp = head;
		 
		 while(temp != null)
		 {
			 arr.add(temp);
			 temp = temp.next;
		 }
		 
		 int i = a-1;
		 int j = b-1;
		 
		 while(i < j)
		 {
			 Node x = arr.get(i);
			 arr.set(i, arr.get(j));
			 arr.set(i, x);
			 
			 i++;
			 j--;
		 }
		 
		 for(i = 0; i < arr.size(); i++)
		 {
			 arr.get(i).next = (i == arr.size() - 1) ? null : arr.get(i+1);
		 }
		 
		 return arr.get(0);
	 }
}
