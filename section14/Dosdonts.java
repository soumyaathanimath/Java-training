package section14;

interface Test1
{
	final static int x=10;
	public abstract void meth1();
	public abstract void meth2();
	
	default void meth3()
	{
		System.out.println("Meth3 of Test");
	}
}

public class Dosdonts {
	public static void main(String[] args)
	{
		System.out.println(Test1.x);
		My m=new My();
	}
	

}

interface Test2 extends Test1
{
	void meth4();
}
class My implements Test2
{
	public void meth1() {}
	public void meth2() {}
	public void meth3() {}
	public void meth4() {}
}

