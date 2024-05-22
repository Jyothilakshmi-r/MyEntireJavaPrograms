package basicknowledge;

public class AvgOfArrayValue {
	static int sum=0;
	static double average=0;
	static int remainder=0;
	public static void main(String[] args) 
	{
		int numbers[]=new int[4];
		numbers[0]=25;
		numbers[1]=25;
		numbers[2]=17;
		numbers[3]=100;
		
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		average=sum/numbers.length;
		remainder=sum%(numbers.length);
		System.out.println("average= "+average);
		System.out.println("remainder= "+remainder);
//		System.out.print(remainder);

	}

}


//a=20,b=40,c=50,