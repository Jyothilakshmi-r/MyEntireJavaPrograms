package Assignments;

public class UsingFinalGlobalLocal 
{	
	final static int globalvarA= 10;

	public static void MethodUsingLocalVarA(final int a) 
	{
	        // a = 15; this cannot be done as the passing value is final
        System.out.println("Value of local variable A in LocVarMethod : " + a);
    }
	
	public static void MethodUsingGlobalVarA() 
	{
        System.out.println("Value of global variable A in GlobVarMethod: " + globalvarA);
    }

	
	public static void main(String[] args) 
	{
		final int localvarA=25;
		System.out.println("Value of global A= "+ globalvarA);
		System.out.println("Value of local A= "+ localvarA);
		MethodUsingLocalVarA(localvarA);
		MethodUsingGlobalVarA();
	}

}
