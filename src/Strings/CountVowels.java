package Strings;

import java.util.Scanner;

public class CountVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		int count = 0;
		for(int i = 0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		
		System.out.println("Vowek count is : " + count);
	}
}
