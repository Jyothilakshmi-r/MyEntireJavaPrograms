package basicknowledge;
class ParentClassOne
{
	void method1() //method of parent class named ParentClassOne
	{
		System.out.println("Method1 of ParentClassOne");
	}
}
public class UpcastingDowncastingEg extends ParentClassOne
{
	void method2() // method of childclass named UpcastingDowncastingEg 
	{
		System.out.println("Method2 of Child class UpcastingDowncastingEg");
	}	
	public static void main(String[] args) 
	{
		ParentClassOne p1=new UpcastingDowncastingEg(); //creates an instance of child class UpcastingDowncastingEg 
		//and upcast it to ParentClassOne object p1
		
		UpcastingDowncastingEg u1= (UpcastingDowncastingEg) p1; //downcasting object p1 of ParentClassOne to object of 
		//child class UpcastingDowncastingEg
		
		p1.method1();//Parent class object calls parent class method1
		u1.method1(); //Child class object calls parent class method1
		u1.method2(); //Child class object calls child class method2
		

	}

}
