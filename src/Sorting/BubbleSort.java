package Sorting;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {8,-2,5,7,6,1,0,3,4};
		
		print(arr);
		bubbleSort(arr);   // TC : O(n^2)
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
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
		{
			boolean isSwapped = true;
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = false;
				}
			}
			
			if(isSwapped) break;
		}
	}
}
