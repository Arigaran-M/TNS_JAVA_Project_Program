package day1;
import java.util.*;
public class AdditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter the a value: ");
		a=sr.nextInt();
		System.out.print("Enter the b value: ");
		b=sr.nextInt();
		c=a+b;
		System.out.println("The Output Is: "+c);
		sr.close();
	}
	
}