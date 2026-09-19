package Sorting;

import java.util.Arrays;

public class TwoSumByTwoPointerApproach 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static boolean twoSum(int[] arr , int target)   // TC : O(n logn)  SC : O(n)
	{
		Arrays.sort(arr);  // due to this space complexity
		int n = arr.length;
		
		int i = 0;
		int j = n - 1;
		
		while(i != j)
		{
			if((arr[i] + arr[j]) == target) return true;
			
			else if((arr[i] + arr[j]) > target) j--;
			else i++;
		}
		
		return false;
	}
}
