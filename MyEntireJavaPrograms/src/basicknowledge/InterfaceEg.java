package basicknowledge;

interface interface1
{
	void abstract_method1(); // no need to mention abstract keyword as it is abstract by default
	
}

public class InterfaceEg implements interface1 
{

	public static void main(String[] args) 
	{
		InterfaceEg e1=new InterfaceEg();
		e1.abstract_method1();

	}

	@Override
	public void abstract_method1() 
	{
		System.out.println("abstract_method1 definition");
		
	}

}
