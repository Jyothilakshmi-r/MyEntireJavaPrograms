package basicknowledge;

import java.util.Arrays;

public class AnagramCheckEg1 {

	public static void main(String[] args)
	{
		String input1="bread";
		String input2="beard";
		
		if(input1.length() != input2.length()) 
		{
			System.out.println("The given strings are not anagram");
		}
		else
		{
			char[] c1=input1.toCharArray();
			char[] c2=input2.toCharArray();
		
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
		
			Arrays.sort(c1);
			Arrays.sort(c2);
		
			System.out.println("After Sorting arrays");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			System.out.println("The given strings "+ input1 +" and " + input2 +" are anagram of each other");
		
		}

	}

}
