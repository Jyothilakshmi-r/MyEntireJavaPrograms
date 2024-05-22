package basicknowledge;

public class World
{
	World()//non parameterized constructor
	{
		System.out.println("1");
	}
	World(int a) // Parameterized constructor
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new World(); // non parameterized object creation
			new World(32000); // Parameterized object creation
	}

}
