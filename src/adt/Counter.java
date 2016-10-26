 package adt;

public class Counter
{
	private int currentCount = 0;
	private String name = null;
	//Constructor
	public Counter(String str)
	{
		this.name = str;
	}
	
	public void increment()
	{
		currentCount++;
	}
	
	public int getCurrentValue()
	{
		return this.currentCount;
	}
	
	public String toString()
	{
		return this.name + ": " + this.getCurrentValue();
	}
}
