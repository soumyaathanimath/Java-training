
package Inheritance;

public class Superconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cuboid c=new Cuboid(5,3,10);
			System.out.println(c.volume());
	}
}
class Rectangle3
{
	int length;
	int breadth;
	
	Rectangle3()
	{
		length=breadth=1;
	}
	Rectangle3(int l,int b)
	{
		length=l;
		breadth=b;
	}
}

class Cuboid extends Rectangle3
{
	int height;
	Cuboid()
	{
		height=1;
	}
	Cuboid(int h)
	{
		height=h;
	}
	Cuboid(int l,int b,int h)
	{
		super(l,b);
		height=h;
	}
	int volume()
	{
		return length*breadth*height;
	}
}


