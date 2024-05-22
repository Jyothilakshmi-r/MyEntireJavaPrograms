package basicknowledge;
import java.util.Arrays;

public class StringNumericValueCountEg1
{
		static int count=0;
		public static void main(String[] args) 
		{
			String name="jyothilakshmi r 123";
			char[] c1= name.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			//int count=0;
			
			for(int i=0;i<c1.length;i++)
			{
				boolean check=Character.isDigit(c1[i]);
				if(check==true)
				{
					count++;
				}
			}
			System.out.println("Count of numbers= "+count);

		}
	}