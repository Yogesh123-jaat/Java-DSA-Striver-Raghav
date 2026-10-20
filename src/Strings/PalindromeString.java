package Strings;

import java.util.Scanner;

public class PalindromeString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		
		int i = 0;
		int j = name.length() - 1;
		boolean flag = true;
		
		while(i < j)
		{
			if(name.charAt(i) != name.charAt(j))
			{
				flag = false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag)
		{
			System.out.println(name + " is palindrome");
		}
		else
		{
			System.out.println(name + " is not palindrome");
		}
	}
}
