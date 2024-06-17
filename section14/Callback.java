package section14;
interface Member
{
	public void callback();
}

public class Callback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s=new Store();
		Customer c1=new Customer("John");
		Customer c2=new Customer("Smith");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}

}
class Store
{
	Member members[]=new Member[10];
	int count=0;
	Store()
{
		
}
	void register(Member m)
	{
		members[count++]=m;
	}
	void inviteSale()
	{
		for(int i=0;i<count;i++)
			members[i].callback();
	}
}
class Customer implements Member
{
	String name;
	Customer(String n)
	{
		name=n;
	}
	public void callback()
	{
		System.out.println("Ok,I will visit,"+name);
	}
}
