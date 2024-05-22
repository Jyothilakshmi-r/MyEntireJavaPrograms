package basicknowledge;

public class NonStaticMethodEg 
{	
	void add()
	{
		int a=100, b=200;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=100, b=200;
		System.out.println(a-b);
	}
	static void mul()
	{
		int a=25, b=10;
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		NonStaticMethodEg a1= new NonStaticMethodEg();
		a1.add();
		a1.sub();
		mul();

	}

}
