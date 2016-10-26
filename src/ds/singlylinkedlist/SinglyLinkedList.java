package ds.singlylinkedlist;

public class SinglyLinkedList
{
	private Node first;
	
	public SinglyLinkedList()
	{
		//default constructor
	}
	/**
	 * Checks is variable first is null then return true
	 * @return
	 */
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	/**
	 * Used to insert at the beginning of the list
	 */
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	/**
	 * Used to insert at the end of list
	 */
	public void insertLast(int data)
	{
		Node current = first;
		while(current.next != null)
		{
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	/**
	 * Return Node and delete first node on the list
	 */
	public Node deleteFirst()
	{
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	/**
	 * Display list first til last
	 */
	public void displayList()
	{
		System.out.println("List(first --> last)");
		Node current = first;
		while(current != null)
		{
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
