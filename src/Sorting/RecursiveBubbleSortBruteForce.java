package Sorting;

public class RecursiveBubbleSortBruteForce 
{
	public static void main(String[] args) 
	{
		int[] arr = {5, 3, 4, 1, 2};
		int n = arr.length;
	    
	    bubbleSort(arr , n);
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
	
	public static void bubbleSort(int[] arr , int n)
	{
		if(n == 1) return;
		
		for(int j = 0; j < n - 1; j++)
		{
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		bubbleSort(arr , n-1);
	}
}
