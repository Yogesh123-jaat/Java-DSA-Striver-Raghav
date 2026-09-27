package LinkedList2;

import java.util.ArrayList;

public class MergeKSortedListsHard 
{
	public static void main(String[] args) 
	{
		
	}
	
	Node merge(Node head1 , Node head2)
    {
        Node dummy = new Node(-1);
        Node k = dummy;
        Node i = head1;
        Node j = head2;
        
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
        
        if(i == null) k.next = j;
        else k.next = i;
        
        
        return dummy.next;
    }
    Node mergeKLists(Node[] arr) 
    {
        if(arr.length == 0) return null;
        
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        
        for(Node ele : arr) list1.add(ele);
        
        while((list1.size() + list2.size()) > 1)
        {
            while(list1.size() > 1)
            {
                Node a = list1.remove(list1.size() - 1);
            
                Node b = list1.remove(list1.size() - 1);
                
                Node c = merge(a,b);
                
                list2.add(c);
            }
            
            if(list1.size() == 1)
            {
                list2.add(list1.remove(0));
            }
            
            while(list2.size() > 1)
            {
                Node a = list2.remove(list2.size() - 1);
                
                Node b = list2.remove(list2.size() - 1);
                
                Node c = merge(a,b);
                
                list1.add(c);
            }
            
            if(list2.size() == 1)
            {
                list1.add(list2.remove(0));
            }
        }
        
        if(list1.size() == 1) return list1.get(0);
        return list2.get(0);
    }
}
