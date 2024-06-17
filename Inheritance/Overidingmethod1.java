package Inheritance;

public class Overidingmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super1 sup=new Super1();
		sup.display();
		Sub1 sub1=new Sub1();
		sub1.display();
		Super1 supRef=new Sub1();
        supRef.display();  
        
	}

}
class Super1
{
	public void display()
	{
		System.out.println("Super1 Class display");
	}
}

class Sub1 extends Super1
{
	@Override
	public void display()
	{
		System.out.println("Sub1 class Display");
	}
}
