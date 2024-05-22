package basicknowledge;
import java.util.Arrays;

public class StringSpecialCharCountEg1
{
		static int spaceCount=0,alphaCount=0,numericCount=0,specialChar=0;
		
		public static void main(String[] args) 
		{
			String name=" jyothi#lakshmi r 123!@  ";
			char[] c1= name.toCharArray();
			int index=c1.length;
			System.out.println(Arrays.toString(c1));
			for(int i=0;i<c1.length;i++)
			{
				boolean check1=Character.isSpaceChar(c1[i]);
				if(check1==true)
				{
					spaceCount++;
				}
				boolean check2=Character.isAlphabetic(c1[i]);
				if(check2==true)
				{
					alphaCount++;
				}
				boolean check3=Character.isDigit(c1[i]);
				if(check3==true)
				{
					numericCount++;
				}
			}
			System.out.println("Length of string " + name +"= "+c1.length);
			System.out.println("Spaces= " +spaceCount);
			System.out.println("Alphabets= " +alphaCount);
			System.out.println("Numbers= " +numericCount);
			specialChar= c1.length -(spaceCount+alphaCount+numericCount);
			System.out.println("Special Characters= " +specialChar);
		}
	}