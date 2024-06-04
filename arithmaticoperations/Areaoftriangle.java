package arithmaticoperations;

import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) //{
		//TODO Auto-generated method stub  
		
		//Area of Triangle  with 3 sides 
        // s = 1\2(a+b+c)
       //area= root of(s(s-a)(s-b)(s-c)


		//int a,b,c;
		//float s,area;
		//System.out.println("Enter the number");
		//Scanner sc=new Scanner(System.in);
		//a=sc.nextInt();
		//b=sc.nextInt();
		//c=sc.nextInt();
		//s=(a+b+c)/2;
		//System.out.println(s);
		
		//area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		//System.out.println("area of triangle is:"+area);	                                                                        
	//}
//}
{
float base,height,area;
System.out.println("enter the base & height");
Scanner sc=new Scanner(System.in);
base=sc.nextInt();
height=sc.nextInt();
area=base*height/2;
System.out.println("area of triangle:"+area);
}
}