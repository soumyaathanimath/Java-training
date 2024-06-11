package Product;

import java.util.Scanner;

public class Product {
		public static void main(String[] args) 
	{
	Product p1=new Product("q1","Apple");
	Product p2=new Product("q1","Apple",10,100);
	Customer c1=new Customer("a12","Abhi");
	Customer c2=new Customer("a12","Abhi","Hubli","9108");
	
	c1.details();
	c2.details();
	p1.details();
	p2.details();
	
	
	}

}
class Product
{	
	private String ItmNo;
	private String Name;
	private double Price;
	private int qty;

	public Product(String i)
	{
		ItmNo=i;
	}
	public Product(String i,String n)
	{
		ItmNo=i;
	Name=n;
	}
	public Product(String i,String n,double p,int q)
	{

		ItmNo=i;
		Name=n;
		setPrice(p);
		setQty(q);
	
	}
	public String getName()
	{
		return Name;
	}
	public String getItmNo() 
	{
		return ItmNo;
	}
	
	public double getPrice()
	{
		return Price;
	}
	public int getQuantity()
	{
		return qty;
	}
	public void setPrice(double price)
	{
		this.Price=price;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public void details()
	{
		System.out.println(ItmNo+"\n"+Name+"\n"+Price+"\n"+qty);
	}
	
}


class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String cId,String name)
    {
        this.custId=cId;
        this.address=name;
    }
    public Customer(String cId,String name,String address,String phno)
    {
        this.custId=cId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId()
    {
    	return custId;
    }
    public String getName()
    {
    	return name;
    }
    public String getAddress()
    {
    	return address;
    }
    public String getPhno()
    {
    	return phno;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
    public void details()
	{
		System.out.println(custId+"\n"+name+"\n"+address+"\n"+phno);
	}
}

