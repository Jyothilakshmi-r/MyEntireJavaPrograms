package CollectionEg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListAndSetEg {

	public static void main(String[] args) 
	{
		System.out.println("Lets understand about List");	
		List a1=new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		a1.add("bag");
		System.out.println(a1);
		
		a1.add("pen");
		System.out.println(a1);
		
		a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		Iterator i1= a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("............................");
		System.out.println("Lets understand about Set");
		Set a2=new HashSet();
		a2.add("pen");
		a2.add("pencil");
		a2.add("box");
		a2.add("bottle");
		a2.add("bag");
		System.out.println(a2);
		
		a2.add("pen");
		System.out.println(a2);
		
		a2.add(null);
		a2.add(null);
		a2.add(null);
		System.out.println(a2);

		Iterator i2= a1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}

	}

}
