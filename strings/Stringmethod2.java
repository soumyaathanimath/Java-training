package strings;

public class Stringmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1="mr.hrithik roshan";
		//String str2="china";
		String str1="a9";
		//String str2=new String("soumya athanimath");
		//System.out.println(str1.startsWith("mr"));
		//System.out.println(str1.endsWith("roshan"));
		
		//if we want name should be in straight line the this code is used 
		
		//for(int i=0;i<str1.length();i++)
		
		//System.out.println(str1.charAt(i));
		
		//System.out.println(str1.indexOf(".",4));
		//System.out.println(str1.compareTo(str2));
	
		//System.out.println(str1+str2);
		
		System.out.println(str1.matches("[a-z][0-9]"));
		System.out.println(str1.matches("\\d"));
	}
}
