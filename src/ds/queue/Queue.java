package ds.queue;

public class Queue
{
	private int maxSize; //Initializes a set number of slots
	private long[] queueArray; // Slots to maintain array
	private int front; //Holds index position for element in the front
	private int rear; //Holds index position of element at back of line
	private int nItem; //Number items in queue
	
	public Queue(int size)
	{
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0; //Index position of first slot
		this.rear = -1; //Starts with no items in array.
		this.nItem = 0; //No elements in array
		
	}
	
	public void insert(long j)
	{
		if(rear == maxSize -1)
		{
			rear = -1;
		}
			rear++;
			queueArray[rear] = j;
			nItem++;
		
	}
	
	public long remove() //Removes item from front of queue
	{
		long temp = queueArray[front];
		front++;
		if(front == maxSize)
		{
			front = 0; //Set front back to zero index
		}
		nItem--;
		return temp;
	}
	
	public long peekFront()
	{
		return queueArray[front];
	}
	
	public boolean isEmpty()
	{
		return(nItem == 0);
	}
	
	public boolean isFull()
	{
		return(nItem == maxSize);
	}
	
	public void view()
	{
		System.out.print("[ ");
		for(int i = 0; i < queueArray.length; i++)
		{
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("] ");
	}
	
}
