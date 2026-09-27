package LinkedList2;

import java.util.ArrayList;

public class MergeKSortedListsLeetcodeEasy 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node merge(Node list1, Node list2) 
    {
		Node dummy = new Node(-1);
		Node i = list1;
		Node j = list2;
		Node k = dummy;

        while(i != null && j != null)
        {
            if(i.val <= j.val)
            {
                k.next = i;
                i = i.next;
            }
            else
            {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if(i == null)
        {
            k.next = j;
        }
        else
        {
            k.next = i;
        }

        return dummy.next;
    }
    public Node mergeKLists(Node[] lists) 
    {
        if(lists.length == 0) return null;

        ArrayList<Node> arr = new ArrayList<>();
        for(int i = 0; i < lists.length; i++) arr.add(lists[i]);

        while(arr.size() > 1)
        {
        	Node a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);

            Node b = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);

            Node c = merge(a,b);

            arr.add(c);
        }   

        return arr.get(0);
    }
}
