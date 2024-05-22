package basicknowledge;

public class LocalVariableEg 
{
	static void add()
	{
		int a=100; //local variable 'a' to add
		int b=20;
		System.out.println("a+b =" + (a+b));
	}
	void sub(int a,int b) 
	{
		int a1=a; //
		int b1=b;
		System.out.println("a1-b1 =" + (a1-b1));
	}
	static void mul(int x,int y)
	{
		int a=x;
		int b=y;
		System.out.println("a*b =" + (a*b));
	}
	void div(int a,int b) 
	{
		int a1=a; //
		int b1=b;
		System.out.println("a/b =" + (a1/b1));
	}
	void mod()
	{
		double a=200;
		double b=17;
		System.out.println("a%b ="+ (a%b));
	}

	public static void main(String[] args) 
	{
		add();
		int x=100, y=25;
		LocalVariableEg l=new LocalVariableEg();
		l.sub(x, y);
		mul(x,y);
		l.div(x, y);
		l.mod();
		
	}

}
