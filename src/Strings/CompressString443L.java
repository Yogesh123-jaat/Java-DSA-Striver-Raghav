package Strings;

public class CompressString443L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int compress(char[] chars)
	{
		int n = chars.length;
		StringBuilder sb = new StringBuilder();
		int left = 0;
		
		
		while(left < n)
		{
			int right = left;
			while(right < n && chars[right] == chars[left])
			{
				right++;
			}
			
			sb.append(chars[left]);
			if((right-left) > 1)
			{
				sb.append(right-left);
			}
			left = right;
		}
		
		String ans = sb.toString();
		
		for(int i = 0; i < ans.length(); i++)
		{
			chars[i] = ans.charAt(i);
		}
		
		return chars.length;
	}
}
