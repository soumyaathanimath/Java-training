package multithreading;

class MyThread extends Thread
{
	//public MyThread(String name)
	//{
		//super(name);
		//setPriority(Thread.MIN_PRIORITY);
		//setPriority(Thread.MAX_PRIORITY);
		//setPriority(Thread.NORM_PRIORITY);
	//}
	 
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++ +"My thread");
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class Threadmethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    //MyThread t=new MyThread("My Thread 1");
    //System.out.println("ID "+t.getId());
    //System.out.println("Name "+t.getName());
    //System.out.println("Priority"+t.getPriority());
    //t.start();
    //t.interrupt();
    //System.out.println("State "+t.getState());
    //System.out.println("Alive "+t.isAlive());
	
	MyThread t=new MyThread();
	//t.setDaemon(true);
	t.start();
	int count=1;
	while(true)
	{
	//Thread mainThread=Thread.currentThread();
	//mainThread.join();
	
	System.out.println(count++ +"Main");
	Thread.yield();
}
	}
}
