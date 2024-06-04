package arithmaticoperations;

public class bitshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=8;
		
		int c=a&b;
		System.out.println("adding operation:"+c);
		int w=a|b;
		System.out.println("or operation:"+w);
		int x=a^b;
		System.out.println("xor operation:"+x);
		int y=~a;
		System.out.println("not operation:"+y);
		long d=w>>>2;
		System.out.println("right shift by two:"+d);
		
		
		

	}

}
