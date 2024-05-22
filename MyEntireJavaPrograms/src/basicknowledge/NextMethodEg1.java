package basicknowledge;
import java.util.Scanner;

public class NextMethodEg1 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		byte b1= s1.nextByte();
		System.out.println(b1);
		
		short a2=s1.nextShort();
		System.out.println(a2);
		
		int a1=s1.nextInt();
		System.out.println(a1);
		
		long l1=s1.nextLong();
		System.out.println(l1);
		
		String st=s1.next();
		System.out.println(st);
		
		float f1=s1.nextFloat();
		System.out.println(f1);
		
		double d1=s1.nextDouble();
		System.out.println(d1);
		
		boolean b=s1.nextBoolean();
		System.out.println(b);
		
		s1.close();		
	}
}
