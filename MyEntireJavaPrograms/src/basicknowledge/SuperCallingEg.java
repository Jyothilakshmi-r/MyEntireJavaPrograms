package basicknowledge;

import java.util.Scanner;

class College
{
	College()
	{
		System.out.println("College");
	}
}

class School extends College
{
	School()
	{
		System.out.println("School");
	}
}

public class SuperCallingEg 
{

	public static void main(String[] args) 
	{
	School s1=new School();
	 

	}

}
