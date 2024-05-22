package basicknowledge;

public class IibEg 
{
	//SIB
	static 
	{
		System.out.println("SIB1");
	}
	static 
	{
		System.out.println("SIB2");
	}
	//IIB
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		IibEg i1=new IibEg();
		IibEg i2=new IibEg();
	}

}
