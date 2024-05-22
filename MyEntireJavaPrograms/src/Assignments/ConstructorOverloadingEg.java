package Assignments;

public class ConstructorOverloadingEg 
{
	ConstructorOverloadingEg(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	ConstructorOverloadingEg(int a, int b, String s1, char x, double c, String s2,float f)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s1);
		System.out.println(x);
		System.out.println(c);
		System.out.println(s2);
		System.out.println(f);
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloadingEg(5,10);
		new ConstructorOverloadingEg(25,100,"JyothiLakshmi", 'a',3.14,"Kerala",25.123f);
	}
}
