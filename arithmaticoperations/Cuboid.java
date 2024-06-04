package arithmaticoperations;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth,height;
		int totalarea,volume;
		System.out.println("enter the values for l,b and h");
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalarea=2*(length*height+breadth*height+length*breadth);
		volume=length*breadth*height;
		
		System.out.println("Area of cuboid is:"+totalarea);
		System.out.println("Volume of cuboid is:"+volume);
		          

	}

}
