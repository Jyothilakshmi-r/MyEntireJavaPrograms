package basicknowledge;

import java.util.Arrays;

public class ArrayCopyInReverseOrderEg1 {

	public static void main(String[] args)
	{
		String name[]=new String[5];
		name[0]="Jyothi";
		name[1]="Nandhu";
		name[2]="Vedhu";
		name[3]="Deva";
		name[4]="Rajanish";
		String nameCopy[]=new String[name.length];
		for(int i=name.length-1,j=0;i>=0;i--,j++)
		{	
			nameCopy[i]=name[j];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(nameCopy));
	}

}
