package basicknowledge;

public class GlobalVariableEg2 
{
	String name="Jyothi"; //global variable
	
	public static void main(String[] args) 
	{
		GlobalVariableEg2 g1=new GlobalVariableEg2();
		g1.name="Lakshmi";
		System.out.println(g1.name);

	}

}
