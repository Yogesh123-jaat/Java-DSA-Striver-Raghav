package Strings;

public class PassingStringToMethods 
{
	public static void change(String x)
	{
		x = "Utkarsh";
	}
	public static void main(String[] args) 
	{
		String x = "Yogesh";
		System.out.println(x);
		change(x);
		System.out.println(x);
	}
}
