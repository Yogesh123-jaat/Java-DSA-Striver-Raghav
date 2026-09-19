package Sorting;

public class MoveZeroesToEndSlidingWindow 
{
	public static void main(String[] args) 
	{
		int arr[] = {0,0,8,0,-2,0,5,7,6,1,0,3,4};
		
		print(arr);
		pushZerosToEnd(arr);   // TC : O(n^2)
		print(arr);
	}
	
	static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	 static void swap(int[] arr , int i , int j)
	 {
		 int temp = arr[i];
	     arr[i] = arr[j];
	     arr[j] = temp;
	 }
	 static void pushZerosToEnd(int[] arr) 
	 {
		 int n = arr.length;

		 int i = 0;
		 int j = 0;
			
		 while(i < n && j < n)
		 {
			  if(arr[i] != 0)
			  {
				  swap(arr , i , j);
			      j++;
			  }
			  i++;
		 }
	 }
}
