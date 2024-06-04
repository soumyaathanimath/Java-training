package arithmaticoperations;

import java.util.Scanner;

public class Quad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		float a,b,c;
		double r1,r2;
		
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		r1=(-b + Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b - Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("Root1 is:"+r1);
		System.out.println("Root2 is:"+r2);
	}

}
