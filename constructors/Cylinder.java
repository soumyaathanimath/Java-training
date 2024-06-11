package constructors;

import java.util.Scanner;

public class Cylinder {
              
	         private double radius;
	         private double height;
	         
	public double getHeight()
	{
		return height;
	}
	public double getradius()
	{
		return radius;
	}
	public double getRadius()
	{
		return radius;
	}
    public void setHeight(double h)
    {
    	if(h>=0)
    		height=h;
    	else
    		height=0;
    }
    public void setRadius(double r)
    {
    	if(r>=0)
    		radius=r;
    	else
    		radius=0;
    }
    public void Dimensions(double h,double r)
    {
    	height=h;
    	radius=r;
    }
    public Cylinder()
    {
    	radius=1;
    	height=2;
    }
    public Cylinder(double r,double h)
    {
    	radius=1;
    	height=2;
    }
   
    public double lidArea()
    {
    	return Math.PI*radius*radius;
    }
    public double circum()
    {
    	return 2*Math.PI*radius;
    }
    public double volume()
    {
    	return lidArea()*height;
    }
    public double surface()
    {
    	return 2*lidArea()+circum()*height;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("\n\nEnter a radius and height of cylinder");
    	double r=sc.nextDouble();
    	double h=sc.nextDouble();
    	
    	Cylinder c=new Cylinder();
    	c.setHeight(h);
    	c.setRadius(r);
    	c.Dimensions(h,r);
    	System.out.println("empty constructor");
    	System.out.println("Area of Cylinder is:"+c.lidArea());
    	System.out.println("Circum of Cylinder is:"+c.circum());
    	System.out.println("Volume of Cylinder is:"+c.volume());
    	System.out.println("Surface of Cylinder is:"+c.surface());
    	
    	Cylinder c1=new Cylinder(r,h);
    	System.out.println("height is:"+h+"\nradius is:"+r);
    	System.out.println("Area of Cylinder is:"+c1.lidArea());
    	System.out.println("Circum of Cylinder is:"+c.circum());
    	System.out.println("Volume of Cylinder is:"+c.volume());
    	System.out.println("Surface of Cylinder is:"+c.surface());
    	
    	sc.close();
    	}
}

