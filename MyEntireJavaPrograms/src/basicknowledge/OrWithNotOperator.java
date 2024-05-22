package basicknowledge;

public class OrWithNotOperator {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		if(!(a==b || b!=a))
		{
			System.out.println("OR with NOT operator");
		}
		if(!(a==b && b!=a))
		{
			System.out.println("AND with NOT operator");
		}

	}

}
