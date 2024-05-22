package Assignments;

import java.util.Scanner;

public class ArrayWithScannerClassEg {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the size of the array\n");
		int n=s.nextInt();
		int []rollno=new int[n];
		String[] names=new String[n];
		String[] gender=new String[n];
		
		System.out.println("Enter the roll number, name  and gender of "+ n + "students");
		for(int i=0;i<n;i++)
		{
			rollno[i]=s.nextInt();
			names[i]=s.next();
			gender[i]=s.next();
		}
		System.out.println("ROLLNO" +"    "+"NAME"+"   "+"GENDER");
		for(int i=0;i<n;i++)
		{
			System.out.print(rollno[i]+"       ");
			System.out.print(names[i]+"     ");
			System.out.printf(gender[i]+"     ");
			System.out.println();
		}
	}

}
