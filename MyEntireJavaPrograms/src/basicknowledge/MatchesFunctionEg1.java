package basicknowledge;

public class MatchesFunctionEg1 {

	public static void main(String[] args) 
	{
		String input="Jyothi";
		//check if the input string starts with 'M'
		System.out.println( input.matches("M(.*)"));
		
		
		//check if the input string ends with i
		System.out.println( input.matches("(.*)i"));
		
		//check if the input string contains 5 letters in it
		String input1="malik";
		System.out.println( input1.matches("....."));
		
		//prints the last index of letter 'o' 
		String a1="School";
		System.out.println( a1.lastIndexOf('o'));

	}

}
