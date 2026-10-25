package Strings;

public class ReverseEachWordInAStringGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static String reverseWords(String s)
	{
		String[] words = s.trim().split("//s+");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < words.length; i++)
		{
			sb.append(new StringBuilder(words[i]).reverse());
			if(i < words.length - 1) sb.append(" ");
		}
		
		return sb.toString();
	}
}
