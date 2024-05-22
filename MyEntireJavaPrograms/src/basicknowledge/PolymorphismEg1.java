package basicknowledge;
class ParentA
{
	void add() 
	{
		System.out.println("ADD of ParentA");
	}
}

public class PolymorphismEg1 extends ParentA
{	
	void add() //overriding the method add() of ParentA
	{
		System.out.println("ADD of Child");
	}

	public static void main(String[] args) 
	{
		ParentA p1= new ParentA();
		p1.add();
		PolymorphismEg1 pe1= new PolymorphismEg1();
		pe1.add();
	}

}
