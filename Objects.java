package javalangpackages;

import java.lang.*;

class MyObject
{
	public String toString()
	{
		return "My Object";
	}
}

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyObject o1=new MyObject();
    MyObject o2=new MyObject();
    System.out.println(o1.equals(o2));
	}

}
