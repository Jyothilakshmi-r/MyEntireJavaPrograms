package basicknowledge;

import java.util.Scanner;

public class ArrayAtRuntimeEg1 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[3];
		
	/*	rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
	 */
		
		for(int i=0;i<3;i++)
			// i<3 or i<rollno.length()
		{
			System.out.println("Enter the Array elements for index-> "+i);
			
			rollno[i]=s1.nextInt();
			System.out.println(rollno[i]);
		}
		
	}

}
