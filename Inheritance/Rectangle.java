package Inheritance;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1=new Rectangle();
		Rectangle R2=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length and breadth");
		R1.length=sc.nextDouble();
		R2.breadth=sc.nextDouble();
		
		System.out.println("Area of rectangle is:"+R1.area());
		System.out.println("Perimeter of rectangle is:"+R1.perimeter());
		System.out.println("Enter a length and breadth of Rectangle");
		R2.length=sc.nextDouble();
		R2.breadth=sc.nextDouble();
		System.out.println("Area of Rectangle is:"+R2.area());
		System.out.println("Perimeter of Rectangle is:"+R2.perimeter());
		System.out.println("It is Square:"+R2.isSquare());
		
	}



public double length,breadth;
public double area()
{
	return length*breadth;
}
public double perimeter()
{
	return 2*(length+breadth);
}
public boolean isSquare()
{
	if(length==breadth)
	{
		return true;
	}
	return false;
}
}