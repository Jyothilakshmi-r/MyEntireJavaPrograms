package basicknowledge;



public class ThisKeywordEg1
{
	
	ThisKeywordEg1()
	{
		this(1000);
		System.out.println("1");
	}
	ThisKeywordEg1(int a)
	{
		
		System.out.println("2");
	}
	ThisKeywordEg1(double a)
	{
		this();
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		ThisKeywordEg1 a1= new ThisKeywordEg1(3.14);
	
		

	}

}
