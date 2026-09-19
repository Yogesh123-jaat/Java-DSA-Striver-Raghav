package Sorting;

public class SelectionSortFindLargestFirst 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,-5,9,4,0,3,4,5,7};
		print(arr);
		selectionSort(arr);        // TC : O(n^2)
		print(arr);
	}
	
	public static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void swap(int[] arr , int i , int max)
	{
		int temp = arr[i];
		arr[i] = arr[max];
		arr[max] = temp;
	}
	
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = n - 1; i > 0; i--)
		{
			int max = i;
			
			for(int j = 0; j < i; j++)
			{
				if(arr[j] > arr[max]) max = j;
			}
			
			swap(arr , i , max);
		}
	}
}
