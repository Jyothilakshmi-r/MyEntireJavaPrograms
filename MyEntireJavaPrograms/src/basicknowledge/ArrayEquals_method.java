package basicknowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_method 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
	int rollno[]=new int[3];
	
	for(int i=0;i<3;i++)
		// i<3 or i<rollno.length()
	{
		System.out.println("Enter the Array->"+i);
		rollno[i]=s1.nextInt();
	}
	
	System.out.println("Second Array");
	int rollno1[]=new int[3];
	
	for(int i=0;i<3;i++)
		// i<3 or i<rollno.length()
	{
		System.out.println("Enter the Array->"+i);
		rollno1[i]=s1.nextInt();
	}
	if(Arrays.equals(rollno,rollno1)==true)
	{
		System.out.println("Both arrays are same");
	}
	else
	{
		System.out.println("Both arrays are not same");
	}

	}
}

