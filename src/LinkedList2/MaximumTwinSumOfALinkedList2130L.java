package LinkedList2;

import java.util.ArrayList;

public class MaximumTwinSumOfALinkedList2130L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int pairSum(Node head)
	{
		Node temp = head;
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(temp != null)
		{
			arr.add(temp.val);
			temp = temp.next;
		}
		
		int i = 0;
		int j = arr.size() - 1;
		int max = Integer.MIN_VALUE;
		
		while(i < j)
		{
			int ans = arr.get(i) + arr.get(j);
			if(max < ans) max = ans;
			i++;
			j--;
		}
		
		return max;
	}
}
