package basicknowledge;

import java.util.Arrays;

public class CopyOfArrayEg1 {

	public static void main(String[] args)
	{
		String name[]=new String[5];
		name[0]="Jyothi";
		name[1]="Nandhu";
		name[2]="Vedhu";
		name[3]="Deva";
		name[4]="Rajanish";
		String nameCopy[]=new String[name.length];
		for(int i=0;i<name.length;i++)
		{
			nameCopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(nameCopy));
	}

}
