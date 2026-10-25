package Strings;

public class ReverseEachWordInAStringSecondMGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static String reverseWords(String s)
	{
		int left = 0;
		StringBuilder sb = new StringBuilder();
		int n = s.length();
		
		while(left < n)
		{
			while(left < n && s.charAt(left) == ' ') left++;
			if(left >= n) break;
			
			int right = left;
			while(right < n && s.charAt(right) != ' ') right++;
			
			if(sb.length() > 0) sb.append(" ");
			
			sb.append(new StringBuilder(s.substring(left , right)).reverse());
			
			left = right;
		}
		
		return sb.toString();
	}
}
