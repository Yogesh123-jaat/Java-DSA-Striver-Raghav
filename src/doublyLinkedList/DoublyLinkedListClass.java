package doublyLinkedList;

class ListNode
{
	ListNode next;
	ListNode prev;
	int val;
	
	ListNode(int val)
	{
		this.val = val;
	}
}
class DLL
{
	ListNode head;
	ListNode tail;
	int size;
	
	void insertAtHead(int val)
	{
		ListNode temp = new ListNode(val);
		
		if(head == null) head = tail = temp;
		else
		{
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		size++;
	}
	
	void insertAtTail(int val)
	{
		ListNode temp = new ListNode(val);
		
		if(head == null) head = tail = temp;
		else
		{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
		size++;
	}
	
	void deleteAtHead()
	{
		if(size == 0) 
		{
			System.out.println("List is Empty!");
			return;
		}
		if(size == 1) head = tail = null;
		else
		{
			head = head.next;
			head.prev = null;
		}
		size--;
	}
	
	void deleteAtTail()
	{
		if(size == 0) 
		{
			System.out.println("List is Empty!");
			return;
		}
		if(size == 1) head = tail = null;
		else
		{
			tail = tail.prev;
			tail.next = null;
		}
		size--;
	}
	
	void insert(int idx , int val)
	{
		if(idx < 0 || idx > size) 
		{
			System.out.println("Invalid Index...");
			return;
		}
		if(idx == 0)
		{
			insertAtHead(val);
			return;
		}
		if(idx == size)
		{
			insertAtTail(val);
			return;
		}
		ListNode temp = head;
		
		for(int i = 0; i < idx - 1; i++)
		{
			temp = temp.next;
		}
		
		ListNode a = new ListNode(val);
		a.prev = temp;
		a.next = temp.next;
		temp.next = a;
		a.next.prev = a;
		size++;
	}
	
	void deleteAtIndex(int idx)
	{
		if(size == 0) 
		{
			System.out.println("List is Empty...");
			return;
		}
		
		if(idx >= size)
		{
			System.out.println("Invalid index!");
			return;
		}
		
		if(idx == 0)
		{
			deleteAtHead();
			return;
		}
		
		if(idx == size - 1)
		{
			deleteAtTail();
			return;
		}
		ListNode temp = head;
		
		for(int i = 0; i < idx - 1; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		temp.next.prev = temp;
		size--;
	}
	
	void display()
	{
		ListNode temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void displayReverse()
	{
		ListNode temp = tail;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.prev;
		}
		System.out.println();
	}
}
public class DoublyLinkedListClass 
{
	public static void main(String[] args) 
	{
		DLL list = new DLL();
		
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.display();
		list.insertAtTail(40);
		list.display();
//		list.displayReverse();
//		list.deleteAtHead();
//		list.deleteAtTail();
//		list.display();
		
		list.insert(2, 80);
		list.display();
		
		list.deleteAtIndex(2);
		list.display();
		
	}
}
