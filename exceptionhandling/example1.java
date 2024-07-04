package exceptionhandling;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,5,8,6};
		try
		{
			int c=a[0]/a[2];
			System.out.println("Division is"+c);
			System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid");
		}
		System.out.println("Bye");
	}
}
