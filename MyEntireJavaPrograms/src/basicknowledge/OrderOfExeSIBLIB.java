package basicknowledge;

public class OrderOfExeSIBLIB {
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		OrderOfExeSIBLIB e1=new OrderOfExeSIBLIB();
		OrderOfExeSIBLIB e2=new OrderOfExeSIBLIB();
		
	}
	OrderOfExeSIBLIB()
	{
		System.out.println("Constructor");
	}

}
