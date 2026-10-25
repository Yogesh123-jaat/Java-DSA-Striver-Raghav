package Strings;

public class CompressStringGFGPractice 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static String compressString(String s) 
    {
		s = s.toLowerCase();
		int n = s.length();
		
		StringBuilder sb = new StringBuilder();
		int left = 0;
		
		while(left < n)
		{
			int right = left;
			
			while(right < n && s.charAt(right) == s.charAt(left))
			{
				right++;
			}
			
			sb.append(s.charAt(left));
			sb.append(right-left);
			left = right;
		}
		
		return sb.toString();
    }
}
