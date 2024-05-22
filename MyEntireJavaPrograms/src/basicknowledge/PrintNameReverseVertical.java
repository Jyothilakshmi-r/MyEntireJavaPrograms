package basicknowledge;

public class PrintNameReverseVertical 
{

	public static void main(String[] args) 
	{
		String name="Priya";
		for(int i=(name.length()-1);i>=0;i--) 
		{
			char ch=name.charAt(i);
			System.out.println(ch);
		}
	}

}
