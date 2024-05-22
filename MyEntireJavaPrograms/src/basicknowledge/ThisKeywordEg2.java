package basicknowledge;



public class ThisKeywordEg2
{
	
	ThisKeywordEg2()
	{
		this(1000);
		System.out.println("1");
	}
	ThisKeywordEg2(int a)
	{
		
		System.out.println("2");
	}
	ThisKeywordEg2(double a)
	{
		this('j',"Jyothi");
		System.out.println("3");
	}

	ThisKeywordEg2(char a,String b)
	{
		
	}
	public static void main(String[] args) 
	{
		ThisKeywordEg2 a1= new ThisKeywordEg2(3.14);

	}

}
