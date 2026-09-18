package Sorting;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,-5,9,4,0,3,4,5,7};
		print(arr);
		insertionSort(arr);        // TC : O(n^2)
		print(arr);
	}
	
	public static void print(int[] arr)
	{
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void insertionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
		{
			int j = i;
			
			while(j > 0 && arr[j-1] > arr[j])
			{
				swap(arr , j-1 , j);
				j--;
			}
		}
	}
}
