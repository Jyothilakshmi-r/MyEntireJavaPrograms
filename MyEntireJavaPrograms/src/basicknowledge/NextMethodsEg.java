package basicknowledge;
import java.util.Scanner;

public class NextMethodsEg {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int n1=s1.nextInt();
		int n2=s1.nextInt();
		int result=n1+n2;
		System.out.println("Result = "+ result);
		s1.close();

	}

}
