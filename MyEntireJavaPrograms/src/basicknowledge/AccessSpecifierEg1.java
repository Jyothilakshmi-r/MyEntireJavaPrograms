package basicknowledge;


public class AccessSpecifierEg1 
{
	public void add()
	{
		System.out.println("1");
	}
	private static void sub()
	{
		System.out.println("2");
	}
	protected void mul()
	{
		System.out.println("3");
	}
	void div()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		AccessSpecifierEg1 e1= new AccessSpecifierEg1();
		e1.add();
		sub();
		e1.mul();
		e1.div();
		

	}

}
