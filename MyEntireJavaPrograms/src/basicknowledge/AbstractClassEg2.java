package basicknowledge;

	class Concrete_class1
	{
		void display1() //concrete method1
		{
			System.out.println("Concrete method1 in concrete class1");
		}
	}
	abstract class Abstract_class1 extends Concrete_class1 //Abstract class1
		{
			abstract void un();//abstract method1			
			void display1()//concrete method1
			{
				super.display1();
				System.out.println("Concrete method1 in abstract class1");
			}
		}	
	abstract class Abstract_class2 extends Abstract_class1 //Abstract class2
	{
		abstract void un_mob1();//abstract method1			
		void display1()//concrete method1
		{
			super.display1();
			System.out.println("Concrete method1 in abstract class2");
		}
	}
	public class AbstractClassEg2 extends Abstract_class2 //Concrete class2
	{
		public static void main(String[] args) 
		{
			AbstractClassEg2 a1=new AbstractClassEg2();
			a1.display1();
		}
		@Override
		void un()
		{  	}
		@Override
		void un_mob1() 
		{	}
		
	}


