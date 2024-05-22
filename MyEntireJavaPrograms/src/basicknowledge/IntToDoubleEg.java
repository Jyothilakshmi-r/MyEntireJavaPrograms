package basicknowledge;

public class IntToDoubleEg 
{
	public static void main(String[] args) 
	{	
		int age=45;
		
		double newAge1=age; // implicit widening
		
		double newAge2=(double)age; //explicit widening
		
		System.out.println("newAge1 = "+newAge1); 
		System.out.println("newAge2 = "+newAge2);
		
	}

}
