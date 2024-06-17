package Inheritance;

class Car
{
	public void start()
	{
		System.out.println("Car Started");
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car gear changed");
	}
	
}	
class LuxuryCar extends Car
	{
	@Override	
	public void changeGear()
		{
			System.out.println("Automatic Gear");
		}
		public void openRoof()
		{
			System.out.println("Sun Roof is Opened");
		}
	}

public class Overidingmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryCar c=new LuxuryCar();
		c.start();
		c.accelerate();
		c.changeGear();
		c.openRoof();

	}
}




