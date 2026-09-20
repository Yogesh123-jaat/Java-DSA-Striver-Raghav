package MergeSort;

public class MergeTwoSortedArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,50,80,100,120};
		int[] b = {30,40,60,70,80,90,110,130,140};
		int[] c = new int[a.length + b.length];
		
		merge(a,b,c);
		print(c);
	}
	
	public static void print(int[] c)
	{
		for(int ele : c)
		{
			System.out.print(ele + " ");
		}
		
		System.out.println();
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
			k++;
			j++;
		}
	}
}
