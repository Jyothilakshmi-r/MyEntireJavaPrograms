package basicknowledge;

abstract class Amazon_Auth
{	abstract void un();//abstract method
	abstract void un_mob();//abstract method
	void login_button()//concrete method
	{	System.out.println("Abstract class 1 concrete method");
	}
}
abstract class Amazon_Login extends Amazon_Auth
{	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()
	{	super.login_button();
		System.out.println("Abstract class 2 concrete method");
	}	
}
public class AbstractClassEg1 extends Amazon_Login
{	static void loginwith_mob()
	{	System.out.println("Concrete class 1 concrete method1");
	}
	static void loginwith_email()
	{	System.out.println("Concrete class 1 concrete method2");
	}
	public static void main(String[] args) 
	{	AbstractClassEg1 abeg1=new AbstractClassEg1();
		abeg1.registration_button();
		loginwith_email();
		loginwith_mob();
	}
	@Override
	void un() 
	{																								
	}
	@Override
	void un_mob() 
	{
	}
	@Override
	void un_as_email() 
	{	
	}
	@Override
	void un_as_mobile() 
	{	
	}
}
