package MergeSort;

public class QuickSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {4,6,2,5,7,9,1,3};
		
		quickSort(arr , 0 , arr.length - 1);
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
	public static void quickSort(int[] arr , int low , int high)
	{	
		if(low < high)
		{
			int partitionIdx = fun(arr , low , high);
			
			quickSort(arr , low , partitionIdx - 1);
			quickSort(arr , partitionIdx + 1 , high);
		}
	}
	
	public static int fun(int[] arr , int low , int high)
	{
		int i = low;
		int pivot = arr [low];
		int j = high;
		
		while(i < j)
		{
			while(arr[i] <= pivot && i < high) i++;
			while(arr[j] > pivot && j > low) j--;
			
			if(i < j) swap(arr , i , j);
		}
		
		swap(arr , low , j);
		return j;
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
