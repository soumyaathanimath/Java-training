package abstractclasses;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.length=10;
		r.breadth=5;
		
		Shape s=r;
		System.out.println(s.area());
	}
}
	
abstract class Shape
{
	abstract public double perimeter();
	abstract public double area();
}

class Circle extends Shape
{
	double radius;
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class rectangle extends Shape
{
	double length;
	double breadth;
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public double area()
	{
		return length*breadth;
	}
}
