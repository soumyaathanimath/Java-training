package exceptionhandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    try
    {
	Divide();
    }
    catch(Exception e)
    {
    System.out.println(e);
	}
}

static FileInputStream fi;
static Scanner sc; 

static void Divide() throws Exception               
{
	fi=new FileInputStream("/Users/soumya/Desktop/Test.txt");       
	sc=new Scanner(fi);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(a/c);
	
	fi.close();
	sc.close();
}
}

