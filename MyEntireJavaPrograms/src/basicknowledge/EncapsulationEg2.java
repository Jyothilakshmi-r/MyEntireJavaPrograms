package basicknowledge;
class Api_program
{
	private int age=18; //global age
	private String un="contact@gmail.com";
	private String pwd="jyothi123";

	public String getUn() 
	{
		return un;
	}

	public void setUn(String un) 
	{
		this.un = un;
	}

	public String getPwd() 
	{
		return pwd;
	}

	public void setPwd(String pwd) 
	{
		this.pwd = pwd;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)  //72
	{
		this.age = age; // local age value is assigned to global age value 
	}
}

public class EncapsulationEg2 
{

	public static void main(String[] args) 
	{
		Api_program a1=new Api_program();
		a1.setAge(72);
		System.out.println(a1.getAge());

	}

}
