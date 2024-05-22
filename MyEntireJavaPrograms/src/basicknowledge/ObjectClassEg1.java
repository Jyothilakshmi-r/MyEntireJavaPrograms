package basicknowledge;


public class ObjectClassEg1 extends Object 
//also you can exclude the word extends Object as it will be called implicitly
{

	public static void main(String[] args) 
	{
		ObjectClassEg1 obj1=new ObjectClassEg1();
		System.out.println(obj1.getClass());


	}

}
