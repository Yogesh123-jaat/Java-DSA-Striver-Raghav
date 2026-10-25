package Strings;

public class UniqueCharacterInStringGFG 
{
	public static void main(String[] args) 
	{
		System.out.println(nonRepeatingChar("yy"));
	}
	
	public static char nonRepeatingChar(String s)
	{
		boolean flag = false;
		for(int i = 0; i < s.length(); i++)
		{
			flag = false;
			for(int j = 0; j < s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j) && i != j)
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				return s.charAt(i);
			}
		}
		
		return '$';
	}
}
