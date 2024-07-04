package scthread;



public class SCthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
		Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("john",atm,200);
        c1.start();
        c2.start();

	}

}
class ATM
{
	public void checkbalance(String name)
	{
		System.out.print(name+"Checking");
		try {Thread.sleep(1000);}catch(Exception e) {}
        System.out.println("Balance");
	}
	
	public void withdraw(String name,int amount)
	{
		System.out.print(name+"withdrawing");
		try 
		{
			Thread.sleep(1000);
		}
		catch(Exception e) {}
        System.out.println(amount);
	}
	}
    
class Customer extends Thread
{
	String name;
	int amount;
	ATM atm;
	Customer(String n,ATM a,int amt)
	{
		name=n;
		atm=a;
		amount=amt;
	}
public void useATM()
{
	atm.checkbalance(name);
	atm.withdraw(name, amount);
}
public void run()
{
	useATM();
}
}

