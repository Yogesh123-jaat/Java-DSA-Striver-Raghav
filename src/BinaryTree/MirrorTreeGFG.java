package BinaryTree;

public class MirrorTreeGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void mirror(Node root)
	{
		if(root == null) return;
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		
		mirror(root.left);
		mirror(root.right);
	}
	
	public static void mirrorin(Node root)
	{
		if(root == null) return;
		
		
		mirrorin(root.left);
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorin(root.left);
	}
}
