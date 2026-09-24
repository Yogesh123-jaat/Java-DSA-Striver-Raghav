package LinkedList;

class Linkedlist
{
	Node head;
	Node tail;
	int size;
	
	void addAtTail(int val)
	{
		Node temp = new Node(val);
		if(head == null) head = tail = temp;
		else
		{
			tail.next = temp;
			tail = temp;
		}
		
		size++;
	}
	
	void display()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void addAtHead(int val)
	{
		Node temp = new Node(val);
		
		if(head == null) head = tail = null;
		else
		{
			temp.next = head;
			head = temp;
		}
		size++;
	}
	
//	boolean search(int val)
//	{
//		if(head == null) return false;
//		
//		Node temp = head;
//		while(temp != null)
//		{
//			if(temp.val == val)
//			{
//				return true;
//			}
//			temp = temp.next;
//		}
//		
//		return false;
//	}
	
	int search(int val)
	{
		if(head == null) return -1;
		int idx = 0;
		
		Node temp = head;
		
		while(temp != null)
		{
			if(temp.val == val)
			{
				return idx;
			}
			temp = temp.next;
			idx++;
		}
		
		return -1;
	}
	
//	void addAtTail(int val)
//	{
//		if(tail == null) 
//		{
//			addAtHead(val);
//			return;
//		}
//		Node temp = new Node(val);
//		tail.next = temp;
//		tail = temp;
//		size++;
//	}
	
	void insert(int val , int idx)
	{
		if(idx < 0 || idx > size)
		{
			System.out.println("Invalid index...");
		}
		else if(idx == 0) addAtHead(val);
		else if(idx == size) addAtTail(val);
		else
		{
			Node newNode = new Node(val);
			
			Node temp = head;
			for(int i = 0; i < idx - 1; i++)
			{
				temp = temp.next;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}
	
	void deleteAtHead()
	{
		if(head == null)
		{
			System.out.println("List is Empty...");
			return;
		}
		head = head.next;
		if(head == null) tail = null;
		size--;
	}
}
public class LinkedListDataStructure
{
	public static void main(String[] args) 
	{
		Linkedlist ll = new Linkedlist();
		
		ll.addAtTail(10);
		ll.addAtTail(20);
		ll.addAtTail(30);
		ll.addAtTail(40);
		
		ll.display();
		ll.addAtHead(50);
		ll.addAtHead(60);
		ll.display();
		
		System.out.println(ll.size);
		
		ll.insert(47,2);
		ll.display();
	}
}
