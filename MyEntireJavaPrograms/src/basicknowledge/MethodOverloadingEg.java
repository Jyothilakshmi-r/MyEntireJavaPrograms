package basicknowledge;

public class MethodOverloadingEg
{
	void add()
	{
		int a=10;
		System.out.println(a+6);
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	static void add(double a)
	{
		
	}
	public static void main(String[] args) 
	{
		add(3.14);
		MethodOverloadingEg a1=new MethodOverloadingEg();
		a1.add();
		a1.add(75000);	

	}

}
