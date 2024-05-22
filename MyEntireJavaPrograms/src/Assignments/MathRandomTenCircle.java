package Assignments;

import java.util.Scanner;

public class MathRandomTenCircle {

	
		public static void main(String[] args) 
		{
			for(int i=1;i<=10;i++) 
			{
				double r=Math.random();
				double area=Math.PI*r*r;
				System.out.println("Area of circle" +i+ "= with radius "+ r + " = " + area);
				
			
			/* OR
			 * double pi=Math.PI;
			 * System.out.println(pi);
			 */
		}

	}
}
