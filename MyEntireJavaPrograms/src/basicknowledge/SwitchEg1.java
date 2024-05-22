package basicknowledge;

import java.util.Scanner;

public class SwitchEg1 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s1.nextInt();
		
		switch(n)
		{ 
			case 1:
				System.out.println("Number is one");
				break;
			case 2:
				System.out.println("Number is two");
				break;
			case 3:
				System.out.println("Number is three");
				break;
			case 4:
				System.out.println("Number is four");
				break;
			case 5:
				System.out.println("Number is five");
				break;
			default:
				System.out.println("Invalid data");
			
		}

	}

}
