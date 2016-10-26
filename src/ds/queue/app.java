package ds.queue;

public class app
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(14);
		myQueue.insert(12);
		myQueue.insert(44);
		myQueue.insert(12);
		myQueue.view();
	}

}
