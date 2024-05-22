package Assignments;

public class NonStaticMathematicalOp {

	 	void add()
		{
			int a=50;
			int b=5;
			int result=a+b;
			System.out.println(result);
		}
		void sub()
		{
			int a=50;
			int b=10;
			int result=a-b;
			System.out.println(result);
		}
		void mul()
		{
			int a=5;
			int b=50;
			int result=a*b;
			System.out.println(result);
		}
		void div()
		{
			int a=50;
			int b=50;
			int result=a/b;
			System.out.println(result);
		}
		void mod()
		{
			int a=500;
			int b=50;
			int result=a%b;
			System.out.println(result);
		}
		public static void main(String[] args) 
		{
			NonStaticMathematicalOp a1= new NonStaticMathematicalOp();
			a1.add();
			a1.sub();
			a1.mul();
			a1.div();
			a1.mod();

		}
	}
