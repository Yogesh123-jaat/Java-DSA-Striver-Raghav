package Sorting;

public class SelectionSort 
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
	
	public static void swap(int[] arr , int min , int i)
	{
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}
	
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			int min = i;
			
			for(int j = i; j < n; j++)
			{
				if(arr[j] < arr[min]) min = j;
			}
			
			swap(arr , min , i);
		}
	}
}
