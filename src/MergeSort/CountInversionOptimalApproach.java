package MergeSort;

public class CountInversionOptimalApproach 
{
	static int count;
	public static void main(String[] args) 
	{
		int[] arr = {2,4,1,3,5};
		count = 0;
		mergeSort(arr);
		System.out.println("Count is : " + count);   // TC : O(nlogn) SC : O(nlogn)
	}
	
	public static void mergeSort(int[] arr)
	{
		int n = arr.length;
		int idx = 0;
		
		if(n == 1) return;
		
		int[] a = new int[n/2];
		int[] b = new int[n-n/2];
		
		for(int i = 0; i < a.length; i++) a[i] = arr[idx++];
		for(int i = 0; i < b.length; i++) b[i] = arr[idx++];
		
		mergeSort(a);
		mergeSort(b);
		
		merge(a,b,arr);
	}
	
	public static void merge(int[] a , int[] b , int[] c)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] <= b[j])
			{
				c[k] = a[i];
				i++;
			}
			else
			{
				count += (a.length - i);
				c[k] = b[j];
				j++;
			}
			k++;
		}
	}
}
