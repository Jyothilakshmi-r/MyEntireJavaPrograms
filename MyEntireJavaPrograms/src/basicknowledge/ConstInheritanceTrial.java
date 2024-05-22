package basicknowledge;
class Parent_Class1
{
	Parent_Class1()
	{
		System.out.println("Grand parent");
	}
}

class Child_Class1 extends Parent_Class1
{
	Child_Class1()
	{
		super(); //implicitly present non parameterized super() calling
		System.out.println("Parent");
	}
}

public class ConstInheritanceTrial  extends Child_Class1
{
	ConstInheritanceTrial()
	{
		super();//implicitly present non parameterized super()calling 
		System.out.println("child");
	}

	public static void main(String[] args) 
	{
		new ConstInheritanceTrial();

	}

}
