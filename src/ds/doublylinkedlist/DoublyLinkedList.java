package ds.doublylinkedlist;

public class DoublyLinkedList
{
	private Node first;
	private Node last;
	
	public DoublyLinkedList()
	{
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void insertFirst(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty())
		{
			last = newNode; //if empty, last will refer to new Node being created
		}
		else
		{
			first.previous = newNode;
		}
		newNode.next = first; // new node's next field will point to the old first
		this.first = newNode; //update first field with reference to new node
	}
	
	public void insertLast(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty())
		{
			first = newNode;
		}
		else
		{
			last.next = newNode; // old last's next field points to new node
			newNode.previous = last; // new node's previous field points back to last
		}
		this.last = newNode;
	}
	
	// assumes non-empty list no exception handling yet
	public Node deleteFirst()
	{
		Node temp = first;
		if(first.next == null)
		{
			last = null;
		}
		else
		{
			first.next.previous = null; // Traverses to second node and sets its previous to null
		}
		first = first.next; // Changes first to value references in first's next field
		return temp;
	}
	
	// assumes non-empty list no exception handling yet
	public Node deleteLast()
	{
		Node temp = last;
		if(first.next == null)
		{
			first = null;
		}
		else
		{
			last.previous.next = null; // Last node's previous node's next field will point to node
		}
		last = last.previous;
		return temp;
	}
	
	// assumes non-empty list
	public boolean insertAfter(int key, int data)
	{
		Node current = first; //Start from begining of the list
		while(current.data != key)
		{
			current = current.next;
			if(current == null)
			{
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last)
		{
			current.next = null;
			last = newNode;
		}
		else{
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
		
	}
	
	// assume non-empty list
	public Node deleteKey(int key)
	{
		Node currentNode = first;
		while(currentNode.data != key)
		{
			currentNode = currentNode.next;
			if(currentNode == null)
			{
				return null;
			}
		}
		
		if(currentNode == first)
		{
			first = currentNode.next;
		}
		else
		{
			currentNode.previous.next = currentNode.next;
		}
		
		if(currentNode == last)
		{
			last = currentNode.previous;
		}
		else
		{
			currentNode.next.previous = currentNode.previous;
		}
		
		return currentNode;
	}
	
	public void displayForward()
	{
		System.out.print("List (first --> last): ");
		Node currentNode = first;
		while(currentNode != null)
		{
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public void displayBackward()
	{
		System.out.print("List (last --> first): ");
		Node currentNode = last;
		while(currentNode != null)
		{
			currentNode.displayNode();
			currentNode = currentNode.previous;
		}
		System.out.println();
	}
}
