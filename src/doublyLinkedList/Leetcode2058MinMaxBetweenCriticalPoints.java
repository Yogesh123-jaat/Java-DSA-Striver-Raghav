package doublyLinkedList;

public class Leetcode2058MinMaxBetweenCriticalPoints 
{
	public static void main(String[] args) 
	{
		
	}
	
	public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        int[] arr = {-1,-1};

        ListNode a = head;
        ListNode b = head.next;
        ListNode c = b.next;
        if(c == null) return arr;

        int idx = 1;
        int fidx = -1;
        int lidx = -1;
        int minDist = Integer.MAX_VALUE;

        while(c != null)
        {
            if((a.val < b.val && c.val < b.val) || (a.val > b.val && c.val > b.val))
            {
                if(fidx == -1) fidx = idx;

                if(lidx != -1)
                {
                    int dist = idx - lidx;
                    if(minDist > dist) minDist = dist;
                }
                lidx = idx;
            }
            a = b;
            b = c;
            c = c.next;
            idx++;
        } 

        int maxDist = lidx - fidx;
        if(maxDist == 0) maxDist = -1;
        if(minDist == Integer.MAX_VALUE) minDist = -1;

        arr[0] = minDist;
        arr[1] = maxDist;


        return arr;

    }
}
