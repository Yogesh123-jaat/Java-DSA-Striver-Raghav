package Sorting;

public class KThSmallest 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int kthSmalest(int[] arr , int k)     // TC : O(n*k)
	{
		int n = arr.length;
		
		for(int i = 0; i < k; i++)
		{
			int min = i;
			
			for(int j = i; j < n; j++)
			{
				if(arr[j] < arr[min]) min = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr[k-1];
	}
}
