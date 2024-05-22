package basicknowledge;
import java.util.Arrays;

public class NumbersOnlyInStringCheck 
{
	static int digitcount=0;
	public static void main(String[] args) 
	{
		String s="123456789";
		char[] c1=s.toCharArray();
		int l=c1.length;
		for(int i=0;i<l;i++)
		{
			boolean check=Character.isDigit(c1[i]);
			if(check==true)
			{
				digitcount=digitcount+1;
			}
		}
		if(l==digitcount)
		{
			System.out.println("The given string "+ s + " contains only digits");
		}
		else
		{
			System.out.println("The given string "+ s + " contains not only digits");
		}
	}
}
