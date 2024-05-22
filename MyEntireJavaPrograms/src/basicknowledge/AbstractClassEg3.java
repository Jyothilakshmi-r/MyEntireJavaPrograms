package basicknowledge;

	class Concrete_class3
	{
		void display1() //concrete method1
		{
			System.out.println("Concrete method1 in concrete class3");
		}
	}
	abstract class Abstract_class3 extends Concrete_class3 //Abstract class1
		{
			abstract void un();//abstract method1			
			void display1()//concrete method1
			{
				super.display1();
				System.out.println("Concrete method1 in abstract class3");
			}
		}	
	class Abstract_class4 extends Abstract_class3 //Abstract class2
	{
		void display1()//concrete method1
		{
			super.display1();
			System.out.println("Concrete method1 in abstract class4");
		}
		@Override
		void un() 
		{	}
	}
	public class AbstractClassEg3 extends Abstract_class4 //Concrete class2
	{
		public static void main(String[] args) 
		{
			AbstractClassEg3 a1=new AbstractClassEg3();
			a1.display1();
		}
		
	}


