package staticvariables;
import java.util.Date;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());

	}

	private char[] getRollNo() {
		// TODO Auto-generated method stub
		return null;
	}
}
class Student1
{
private String rollNo;
private static int count=1;
private String assignRollNo()
{
	Date d=new Date();
	String rno="Univ-"+(d.getYear()+1900)+"-"+count;
	count++;
	return rno;
}

Student1()
{
	rollNo=assignRollNo();
}
public String getRollNo()
{
	return rollNo;
}
}
