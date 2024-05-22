package basicknowledge;

public class GlobalVariableEg3 
{
	String name="Sita";
	int age=19;
	double weight=90.87;
	void add(String name,int age, double weight)
	{
		System.out.println("Hey my biodata is " + name + age + weight);
	}
	public static void main(String[] args) {
		GlobalVariableEg3 g1= new GlobalVariableEg3();
		System.out.println(g1.name);
		System.out.println(g1.age);
		g1.add("ram", 51, 87.87);

	}

}
