package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements 	
{
	public static void main(String[] args) 
	{

	}
	
	public static ArrayList<Integer> commonElements(int[] a , int[] b)   // TC : O(nlogn)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i = 0;
		int j = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] == b[j])
			{
				ans.add(a[i]);
				i++;
				j++;
			}
			else if(a[i] < b[j]) i++;
			else j++;
		}
		
		return ans;
	}
	
}
