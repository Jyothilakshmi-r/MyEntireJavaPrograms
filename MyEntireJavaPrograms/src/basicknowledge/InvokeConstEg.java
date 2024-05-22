package basicknowledge;

class Class1
{
	Class1()
	{
		System.out.println("Class1");
		new InvokeConstEg();
	}
	
}

public class InvokeConstEg 
{
	InvokeConstEg()
	{
		System.out.println("Invoking Constructor");
	}

	public static void main(String[] args) {
		
		new Class1();

	}

}
