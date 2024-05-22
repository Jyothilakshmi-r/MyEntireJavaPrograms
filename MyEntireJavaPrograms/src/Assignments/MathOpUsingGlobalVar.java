package Assignments;

public class MathOpUsingGlobalVar 
{
	int x=24;
	int y=12;
	int a=10;
	
	void add()
	{ 
		int s=x+y;
		System.out.println("x+y= " + s);
	}
	void sub()
	{
		int res=x-y;
		System.out.println("x-y= " + res);
	}
	void mul()
	{
		int res=x*y;
		System.out.println("x*y= " + res);
	}
	void div()
	{
		int res=x/y;
		System.out.println("x/y= " + res);
	}
	void modulus()
	{
		int res=x%y;
		System.out.println("x%y= " + res);
	}
	static double l= 25.12345;
	float f;

	public static void main(String[] args) 
	{
		MathOpUsingGlobalVar a1= new MathOpUsingGlobalVar();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.modulus();
		int a=100;
		System.out.println("Value of a = " + a);
		System.out.println("value of l= "+ l);
		System.out.println("valud of f= "+ a1.f);
	}

}
