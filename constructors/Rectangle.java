package constructors;

import java.util.Scanner;

class Rectangle {
	 
		private double length;
        private double breadth;
	
        public Rectangle()
        {
        	length=1;
        	breadth=1;
        }
        public Rectangle(double l,double b)
        {
        	length=l;
        	breadth=b;
        }
        public Rectangle(double s)
        {
        	length=breadth=s;
        }
 
 public int getLength()
 {
	 return length;
 }
 public int getbreadth()
 {
	 return breadth;
        }
 public void setLength(int l)
 {
	 if(l>=0)
	 {
		 length=1;
	 }
	 else
	 {
		 length=0;
	 }
 }
 public void setBreadth(int b)
 {
	 if(b>=0)
	 {
		 breadth=b;
	 }
	 else
	 {
		 breadth=0;
	 }
 }
public double area()
{
	return breadth*length;
}
public double peri()
{
	return 2*(length+breadth);
}
public boolean isSquare()
{
	if(length==breadth)
	{
		return false;
	}
	return true;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breadth of rectangle");
	int B=sc.nextInt();
	int L=sc.nextInt();
	
     Rectangle R=new Rectangle();
     System.out.println("area is:"+R.area());
     System.out.println("Perimeter is:"+R.peri());
     System.out.println("is Square:"+R.isSquare());
     
     Rectangle R1=new Rectangle(L);
     System.out.println("\narea is:"+R1.area());
     System.out.println("Perimeter is:"+R1.peri());
     System.out.println("is Square :"+R.isSquare());
     
     Rectangle R2=new Rectangle(L,B);
     System.out.println("\narea is:"+R2.area());
     System.out.println("Perimeter is:"+R);
     
     sc.close();
     
}
}