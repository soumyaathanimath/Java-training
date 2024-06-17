package Inheritance;

public class Thissuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("length and breadth:");
		

	}

}
class Rectangle2
{
	int length;
	int breadth;
	
Rectangle2(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
void display()
{
	System.out.println("Length :"+this.length);
	System.out.println("Breadth:"+this.breadth);
}
}