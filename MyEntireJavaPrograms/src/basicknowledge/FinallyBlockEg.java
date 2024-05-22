package basicknowledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockEg 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		try 
		{
			int age=s1.nextInt();
			System.out.println(age);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Handled the exception");
		}
		finally
		{
			System.out.println("Thank you!");
		}
	}

}
