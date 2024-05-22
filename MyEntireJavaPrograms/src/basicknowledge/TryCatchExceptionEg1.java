package basicknowledge;
import java.util.*;
import java.util.Scanner;

public class TryCatchExceptionEg1 
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
			System.out.println("Handled the InputMismatchException");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Handled the IndexOutOfBoundsException");
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled the NullPointerException");
		}
		finally
		{
			System.out.println("This is the finally block");
		}
	}

}
