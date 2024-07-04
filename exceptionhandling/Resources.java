package exceptionhandling;

import java.util.Scanner;

public class Resources {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		{
			try
			{
				Divide();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public class ResourcesDemo
		{
			static void Divide() throws Exception
			{
				try(FileInputStream fi=new FileInputStream("/Users/soumya/Desktop/Test.txt"))
				Scanner sc=new Scanner(fi)
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					System.out.println(a/c);
				}
			}
		}
	
			
		
	
		
	
