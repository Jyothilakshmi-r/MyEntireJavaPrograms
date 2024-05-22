package basicknowledge;

public class DoubleToIntEg
{
	public static void main(String[] args) 
	{
		double pi=3.14;
		int piNewValue =(int)pi; // narrowing is done explicitly only 
		System.out.println("New pi value = "+ piNewValue); //Only 3 will be printed 
	}

}
