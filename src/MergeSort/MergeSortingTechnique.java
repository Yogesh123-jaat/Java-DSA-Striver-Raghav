package MergeSort;

public class MergeSortingTechnique 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,7,6,4,5,2,1,3,4,9,-5,2,-8,9};
		
		mergeSort(arr);  // TC : O(nlogn) SC : O(nlogn)
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
	
	public static void mergeSort(int[] arr)
	{
		int n = arr.length;
		int idx = 0;
		
		if(n == 1) return;
		
//		step 1 : create two new empty arrays of size n/2
		int[] a = new int[n/2];
		int[] b = new int[n - n/2];
		
//		step 2: copy passte arr into a and b
		for(int i = 0; i < a.length; i++) a[i] = arr[idx++];
		for(int i = 0; i < b.length; i++) b[i] = arr[idx++];
		
//		step 3 : magic
		
		mergeSort(a);
		mergeSort(b);
		
//		step 4 : Merge 'a' and 'b into arr
		merge(a,b,arr);
	}
	
	public static void merge(int[] a , int[] b , int[] c)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				c[k] = a[i];
				i++;
			}
			else
			{
				c[k] = b[j];
				j++;
			}
			
			k++;
		}
		
		while(i < a.length)
		{
			c[k] = a[i];
			i++;
			k++;
		}
		
		while(j < b.length)
		{
			c[k] = b[j];
			j++;
			k++;
		}
	}
}
