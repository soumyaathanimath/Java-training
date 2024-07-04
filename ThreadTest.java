package multithreading;

public class ThreadTest extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t=new ThreadTest();
		t.start();
		int i=1;
		
		while(true)
		{
			System.out.println(i+"World");
			i++;
		}
	}
}



	


