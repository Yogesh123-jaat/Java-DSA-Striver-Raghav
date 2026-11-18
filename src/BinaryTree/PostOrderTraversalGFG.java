package BinaryTree;

import java.util.ArrayList;

public class PostOrderTraversalGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void dfs(Node root , ArrayList<Integer> ans)
	{
		if(root == null) return;
		dfs(root.left , ans);
		dfs(root.right , ans);
		ans.add(root.val);
	}
	
	public ArrayList<Integer> preOrder(Node root) 
    {
		ArrayList<Integer> ans = new ArrayList<>();
		dfs(root , ans);
		return ans;
    }
}
