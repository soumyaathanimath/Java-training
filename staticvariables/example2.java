package staticvariables;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		Test t=new Test();

	}
}

class Test 
{
		 static 
		 {
			 System.out.println("block1");
		 }
		 static
		 {
			 System.out.println("block2");
		 }
}

