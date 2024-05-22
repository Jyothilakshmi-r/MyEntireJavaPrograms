package Assignments;

	class Concrete_class1
	{
		void display1()
		{
			System.out.println("Concrete method1 in concrete class1");
		}
		void display2()
		{
			System.out.println("Concrete method2 in concrete class1");
		}
	}
	//Abstract class1
		abstract class Abstract_class1 extends Concrete_class1
		{
			abstract void un();//abstract method
			abstract void un_mob();//abstract method
			
			void display1()//concrete method
			{
				super.display1();
				System.out.println("Concrete method1 in abstract class1");
			}
			void display2()//concrete method
			{
				System.out.println("Concrete method2 in abstract class1");
				super.display2();
			}
		}	
		public class AbstractClassEg extends Abstract_class1 //Concrete class2
		{
			void print3()
			{
				System.out.println("Concrete method1 in concrete class2");
			}
			void print4()
			{
				System.out.println("Concrete method2 in concrete class2");
			}

			public static void main(String[] args) 
			{
				AbstractClassEg a1=new AbstractClassEg();
				a1.display1();
				a1.display2();
				a1.print3();
				a1.print4();
			}
			@Override
			void un()
			{				
			}
			@Override
			void un_mob() 
			{	
			}
	}


