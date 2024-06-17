package Inheritance;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Super sup=new Super();
        sup.meth1();
        sup.meth2();
	}

}
class Super
{
	public void meth1()
	{
		System.out.println("Super meth1");
	}
	public void meth2()
	{
		System.out.println("Super meth2");
	}	
}
class sub extends Super
{
	public void meth2()
	{
		System.out.println("Sub meth2");
	}
	public void meth3()
	{
		System.out.println("Sub meth3");
	}
}
