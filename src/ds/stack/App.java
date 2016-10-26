package ds.stack;

import java.lang.reflect.Array;

public class App
{

	public static void main(String[] args)
	{
		/*
		Stack theStack = new Stack(-2);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty())
		{
			long value = theStack.pop();
			System.out.println(value);
		}
		*/
		System.out.println(reverseString("Hello"));
	}
	
	public static String reverseString(String str)
	{
		Stack stringStack = new Stack(str.length());
		char[] charArray = str.toCharArray();
		for(char value : charArray)
		{
			stringStack.push(value);
		}
		String result ="";
		while(!stringStack.isEmpty())
		{
			char ch = stringStack.pop();
			result += ch;
		}
		return result;
			
		
	}
}
