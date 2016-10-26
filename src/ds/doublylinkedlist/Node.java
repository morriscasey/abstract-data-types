package ds.doublylinkedlist;

public class Node
{
	public Node previous;
	public Node next = null;
	public int data;
	
	public void displayNode()
	{
		System.out.print("{ " + data + " }");
	}
}
