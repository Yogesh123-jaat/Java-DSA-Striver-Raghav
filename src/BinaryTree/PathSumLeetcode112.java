package BinaryTree;

public class PathSumLeetcode112 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static boolean hasPathSum(Node root , int targetSum)
	{
		if(root == null) return false;
		if(root.left == null && root.right == null)
		{
			if(targetSum == root.val) return true;
			else return false;
		}
		
		return hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right , targetSum - root.val); 
	}
}
