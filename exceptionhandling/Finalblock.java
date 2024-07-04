package exceptionhandling;

public class Finalblock {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
		System.out.println(10/5);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("Final Message");
	}
	}
}
