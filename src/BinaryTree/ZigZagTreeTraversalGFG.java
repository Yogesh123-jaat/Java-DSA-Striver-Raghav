package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTreeTraversalGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static ArrayList<Integer> zigZagTraversal(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return arr;
        
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        
        q.add(new Pair(root , 0));
        
        while(q.size() > 0)
        {
            Pair front = q.remove();
            if(front.level != currLevel)
            {
                if(currLevel % 2 == 1) Collections.reverse(arr);
                ans.addAll(arr);
                arr.clear();
                currLevel++;
            }
            arr.add(front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left , front.level + 1));
            if(front.node.right != null) q.add(new Pair(front.node.right , front.level + 1));
        }
        
        if(currLevel % 2 == 1) Collections.reverse(arr);
        ans.addAll(arr);
        
        
        return ans;
    }
}
