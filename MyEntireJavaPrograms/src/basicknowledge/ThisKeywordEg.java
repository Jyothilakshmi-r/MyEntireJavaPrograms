package basicknowledge;



public class ThisKeywordEg 
{
	
	ThisKeywordEg()
	{
		this(1000);
		System.out.println("1");
	}
	ThisKeywordEg(int a)
	{
		this(3.14);
		System.out.println("2");
	}
	ThisKeywordEg(double a)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		ThisKeywordEg a1= new ThisKeywordEg();
	
		

	}

}
