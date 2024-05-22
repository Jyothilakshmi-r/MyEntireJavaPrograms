package Assignments;
import java.util.Scanner;

public class MathOperUsingNext 
{
	static int num1;
	static int num2;
	
	void add(int x, int y)
	{
		System.out.println("Result of num1 + num2 = " + (x+y));
	}
	static void sub(int x,int y)
	{
		int res= x-y;
		System.out.println("Result of num1 - num2 = " + res);
	}
	void mul(int x,int y)
	{
		System.out.println("Result of num1 * num2 = " + (x*y));
	}
	static void div(int x, int y)
	{
		int res= x/y;
		System.out.println("Result of num1 / num2 = " + res);
	}
	static void mod(int x,int y)
	{
		int res= x%y;
		System.out.println("Result of num1 % num2 = " + res);
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int num1=s1.nextInt();
		System.out.println("Enter the second number ");
		int num2=s1.nextInt();
		
		MathOperUsingNext a1=new MathOperUsingNext();
		a1.add(num1,num2);
		
		sub(num1,num2);
		a1.mul(num1, num2);
		div(num1,num2);
		mod(num1,num2);
				
		s1.close();
		
	}

}
