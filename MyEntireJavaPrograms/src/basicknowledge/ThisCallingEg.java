package basicknowledge;



public class ThisCallingEg 
{
	
	ThisCallingEg()
	{
		this(1000);
		System.out.println("1");
	}
	ThisCallingEg(int a)
	{
		this(3.14);
		System.out.println("2");
	}
	ThisCallingEg(double a)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		ThisCallingEg a1= new ThisCallingEg();
	
		

	}

}
