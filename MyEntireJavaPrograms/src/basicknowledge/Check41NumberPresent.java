package basicknowledge;

import java.util.Arrays;

public class Check41NumberPresent 
{
	public static void main(String[] args) 
	{
		int nos[]=new int[4];
		nos[0]=90;
		nos[1]=10;
		nos[2]=65;
		nos[3]=11;
		int givenno=41;
		int count=0;
		for(int i=0;i<nos.length;i++)
		{
			if(givenno==nos[i])
			{
				System.out.println("The given number is present in the array at index position "+ i);
				count++;
			}
			else
			{
				System.out.println("The given number is not present in the array at index position "+ i);	
			}
		}
		System.out.println("Count= "+count);

	}

}
