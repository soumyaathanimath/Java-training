package interprocess;

class MyData
{
	int value;
	public void set(int v)
	{
		value=v;
	}
	public int get()
	{
		int x=0;
		x=value;
		return x;
	}
}

class Producer extends Thread
{
	MyData data;
	public Producer(MyData d)
	{
		data=d;
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			data.set(count);
			System.out.println("Producer "+count);
            count++;
		}
	}
}

class Consumer extends Thread
{
	MyData data;
	public Consumer(MyData d)
	{
		data=d;
	}
	public void run()
	{
		int value;
		while(true)
		{
			value=data.get();
			System.out.println("Consumer "+value);
		}
	}
}
public class MyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyData data=new MyData();
	Producer p=new Producer(data);
	Consumer c=new Consumer(data);
	p.start();
	c.start();

	}

}
