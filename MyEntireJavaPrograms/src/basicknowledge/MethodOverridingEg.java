package basicknowledge;
class Method_parent
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class MethodOverridingEg extends Method_parent
{
	void login()
	{
		System.out.println("Login with email id");
		super.login();
	}
	public static void main(String[] args) 
	{
		MethodOverridingEg m1= new MethodOverridingEg ();
		m1.login();

	}

}
