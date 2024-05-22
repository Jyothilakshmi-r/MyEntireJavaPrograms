package basicknowledge;

class Amazon_application
{
	private String username="contact@gmail.com"; //updates to Jyothi@gmail.com
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;	
	}
	
}
public class EncapsulationEg1
{
	public static void main(String[] args) 
	{
		Amazon_application e1=new Amazon_application();
		e1.setUsername("Jyothi@gmail.com");
		System.out.println(e1.getUsername());
		

	}

}
