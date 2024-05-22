package basicknowledge;

class AutomationBatch41 //'extends Object' can be written explicitly or it will implicitly extend Object class
{
	public void display()
	{
		System.out.println("Display method of AutomationBatch41 class");
	}
}
public class UpcastingEg extends AutomationBatch41 
{

	public static void main(String[] args) 
	{
		Object o1=new AutomationBatch41(); //creates instance of AutomationBatch41 class and stores it to Object o1 which is the superclass
		System.out.println(o1.getClass()); //Calls Object class method getClass() with Object class reference variable o1.
		
		AutomationBatch41 ab41=new AutomationBatch41();// creates object ab41 of child class AutomationBatch41
		System.out.println(ab41.getClass()); // //Calls Object class method getClass() with Child class reference variable ab41.
		
		o1=(Object)ab41; //upcasted child class object ab41 and stores it in o1.
		ab41.display(); 
	}

}
