package Sorting;

public class MoveZeroesToEnd 
{

	public static void main(String[] args) 
	{
		int arr[] = {0,0,8,0,-2,0,5,7,6,1,0,3,4};
		
		print(arr);
		pushZeroToEnd(arr);   // TC : O(n^2)
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

	public static void pushZeroToEnd(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			boolean swapped = true;
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] == 0)
				{
					swap(arr , j+1 , j);
					swapped = false;
				}
			}
			
			if(swapped)
			{
				break;
			}
		}
	}
}
