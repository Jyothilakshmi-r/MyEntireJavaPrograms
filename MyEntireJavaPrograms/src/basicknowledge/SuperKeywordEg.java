package basicknowledge;
class Method_parent1
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class SuperKeywordEg extends Method_parent1
{
	void login()
	{
		System.out.println("Login with email id");
		super.login();
	}
	public static void main(String[] args) 
	{
		SuperKeywordEg m1= new SuperKeywordEg();
		m1.login();

	}

}
