package basicknowledge;

import java.util.Arrays;

public class ArrayPrintEasyWay {

	public static void main(String[] args)
	{	
		String names[]=new String[3];//declaration of array
		names[0]="Jyothi";
		names[1]="Lakshmi";
		names[2]="Radhadevi";
		
		System.out.println(Arrays.toString(names));
	}
}
