package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalGFFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public ArrayList<Integer> levelOrder(Node root) 
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
		q.add(root);

		while(q.size() > 0)
		{
			Node front = q.remove();
			list.add(front.val);
			if(front.left != null) q.add(front.left);
			if(front.right != null) q.add(front.right);
		}
				
				
		return list;
    }
}
