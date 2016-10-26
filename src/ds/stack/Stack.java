package ds.stack;

public class Stack
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size)
	{
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;//Don't want to intialize as zero since that is an actual position
	}
	
	public void push(char j)
	{
		if(!isFull())
		{
			top++;
			stackArray[top] =j;
		}
		else
		{
			System.out.println("You have reached the size limit of "+ maxSize);
		}
	}
	
	public char pop()
	{
		
		if(!isEmpty())
		{
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
		else
		{
			System.out.println("The stack is already empty");
			return 0; 
		}
	}
	
	public long peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return(maxSize-1 == top);
	}
	
	
	
	
	
}
