package staticvariables;

public class Static {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Test t1=new Test();

	}

static class Test          
{
	static int x=10;
	int y=20;
	
	void show()
	{
		System.out.println(x+" "+y);
	}
	static void display()
	{
		System.out.println(x);
	}
}
}
	
	