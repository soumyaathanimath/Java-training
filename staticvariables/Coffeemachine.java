package staticvariables;

public class Coffeemachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMachine m1=CoffeeMachine.getInstance();
	    CoffeeMachine m2=CoffeeMachine.getInstance();
	    CoffeeMachine m3=CoffeeMachine.getInstance();
	    		
	    System.out.println(m1+" "+m2+" "+m3);
		if(m1==m2 && m1==m3)
			System.out.println("Same");
	}

}

class CoffeeMachine
{
	private float coffeeqty;
	private float milkqty;
	private float waterqty;
	private float sugarqty;
	
	static private CoffeeMachine my=null;
	
	private CoffeeMachine()
	{
		coffeeqty=1;
		milkqty=1;
		waterqty=1;
		sugarqty=1;
	}
	
	public void fillWater(float qty)
	{
		waterqty=qty;
	}
	public void fillSugar(float qty)
	{
		sugarqty=qty;
	}
	public float getCoffee()
	{
		return 0.23f;
	}
    static CoffeeMachine getInstance()
    {
    	if(my==null)
    		my=new CoffeeMachine();
    	return my;
    }
}