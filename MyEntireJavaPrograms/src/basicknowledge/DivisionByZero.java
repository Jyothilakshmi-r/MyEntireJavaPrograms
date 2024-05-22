package basicknowledge;

public class DivisionByZero {

	public static void main(String[] args) 
	{
		try 
		{
			int c=1/0;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Division by zero");
		}
		

	}

}
