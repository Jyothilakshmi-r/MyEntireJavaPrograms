package basicknowledge;

public class PalindromeCheck
{
	public static void main(String[] args) 
	{
		String s="malayalam";

		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char op=s.charAt(i);
			rev=rev+op;
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}	
	}

}
