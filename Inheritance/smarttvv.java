package Inheritance;

public class smarttvv {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TV t=new SmartTV();
			t.switchON();
	        t.changeChannel();		

		}

	}

	class TV
	{
		public void switchON()
		{
			System.out.println("TV is switched ON");
		}
		public void changeChannel() {
		    System.out.println("TV Channel is changed");
		}

	}
	class SmartTV extends TV
	{
		public void switchON()
		{
			System.out.println("Smart TV is Switched ON");
		}
		public void changeChannel()
		{
			System.out.println("SmartTV Channel is Changed");
		}
		public void browse()
		{
			System.out.println("Smart Tv Browsing");
		}
	}



