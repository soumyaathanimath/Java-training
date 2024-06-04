package strings;

public class printing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		float b=123.456789f;
		char c='d';
		String str="Java";
		System.out.printf("%+5d",a);
		System.out.printf("%-5f",b);
		System.out.printf("%-4c",c);
		System.out.printf("%6.2f",b);
		System.out.format("%20s",str);
	}
}
