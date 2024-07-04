package exceptionhandling;

import java.util.Scanner;

public class Tryandcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		//c=a/b;
		//System.out.println(c);
		//System.out.println("Bye");
		
        //try
        //{
        	//c=a/b;
        	//System.out.println(c);
        //}
        //catch(ArithmeticException e)
        //{
        	//System.out.println("Denominator should not be 0,try again");
        //}
        //System.out.println("Bye");
	//}
//}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0,try again");
		}
		System.out.println("Bye");
		}
}
