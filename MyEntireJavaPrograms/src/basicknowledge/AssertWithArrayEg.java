package basicknowledge;

public class AssertWithArrayEg 
{
	public static void main(String[] args) 
	{
		   int[] numbers = new int[5];
		   numbers[0]=10;
		   numbers[1]=20;
		   numbers[2]=30;
		   numbers[3]=40;
		   numbers[4]=50;
		        
		   assert numbers.length>6 : "Length is 5 only";
	}
}

