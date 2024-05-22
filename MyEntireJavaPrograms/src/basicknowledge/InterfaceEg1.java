package basicknowledge;
interface interface3
{ 	void abs_method1();
	void abs_method2();
}
interface interface4 extends interface3
{	void abs_method3();
	void abs_method4();	
}
public class InterfaceEg1 implements interface4 
{	void concrete_method1()
	{	System.out.println("concrete_method1 definition");
	}
	static void concrete_method2()
	{	System.out.println("concrete_method2 definition");
	}	
	public static void main(String[] args) 
	{	InterfaceEg1 i1= new InterfaceEg1();
		concrete_method2();
		i1.abs_method1();
		i1.abs_method2();
		i1.abs_method3();
		i1.abs_method4();
	}
	public void abs_method1() 
	{	System.out.println("abstract_method1 definition");
	}
	@Override
	public void abs_method2() 
	{	System.out.println("abstract_method2 definition");	
	}
	@Override
	public void abs_method3() 
	{	System.out.println("abstract_method3 definition");
	}
	@Override
	public void abs_method4() 
	{	System.out.println("abstract_method4 definition");
	}
}
