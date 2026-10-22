package Strings;

public class StringModify 
{
	public static void main(String[] args) 
	{
		String s = "Abcd";
		
		if(s.charAt(0) >= 65 && s.charAt(0) <= 90)
		{
			s = s.toUpperCase();
		}
		else
		{
			s = s.toLowerCase();
		}
		
		System.out.println(s);
	}
}
