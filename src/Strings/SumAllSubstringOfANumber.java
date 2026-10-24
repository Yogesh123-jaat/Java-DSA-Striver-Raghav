package Strings;

public class SumAllSubstringOfANumber
{
	public static void main(String[] args) 
	{
		System.out.println(sumSubstrings("6759"));
	}
	
	public static int sumSubstrings(String s)
	{
		int result = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				result += Integer.parseInt(s.substring(i , j+1));
			}
		}
		
		return result;
	}
}
