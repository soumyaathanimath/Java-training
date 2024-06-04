package strings;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u=20;
		float v=0.0012f;
		char b='A';
		String str="java program";
		//float b=4;
	//	char a=6;
		//String str="hello";
	//	System.out.println("number of:"+b);
		
		//concatenation method
		
//System.out.println("Sum of "+u+" and "+v+" is "+(u+v));
		
		//System.out.printf("Hello %d %f %c \n",u,v,b);
		//System.out.printf("Hello %o %f %c World\n",u,v,b);
		//System.out.printf("%e\n",v);
		//System.out.printf("hello %s \n",str);
		
		//Argument index
		
		//System.out.printf("%1$d,%1$d,%1$d",u);
	System.out.printf("%3$s,%2$f,%1$d",u,v,str);
	}
	
}
