package basicknowledge;
import java.util.Arrays;

public class StringSpaceCountEg1
{
		static int countSpace=0;
		public static void main(String[] args) 
		{
			String name=" jyothi lakshmi r 123  ";
			char[] c1= name.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			//int count=0;
			
			for(int i=0;i<c1.length;i++)
			{
				boolean check=Character.isSpaceChar(c1[i]);
				if(check==true)
				{
					countSpace++;
				}
			}
			System.out.println("Count of number of spaces= "+countSpace);

		}
	}