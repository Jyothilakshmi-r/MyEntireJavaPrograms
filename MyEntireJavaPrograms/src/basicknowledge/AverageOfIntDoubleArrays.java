package basicknowledge;

public class AverageOfIntDoubleArrays 
{
	static int sum1=0;
	static double sum2=0;
	static double average=0;
	static double remainder=0;
	public static void main(String[] args) 
	{
		int numbers1[]=new int[4];
		numbers1[0]=25;
		numbers1[1]=25;
		numbers1[2]=17;
		numbers1[3]=100;
		
		double numbers2[]=new double[4];
		numbers2[0]=5;
		numbers2[1]=25;
		numbers2[2]=35;
		numbers2[3]=100;
		
		for(int i=0;i<numbers1.length;i++)
		{
			sum1=sum1+numbers1[i];
		}
		for(int i=0;i<numbers2.length;i++)
		{
			sum2=sum2+numbers2[i];
		}
		
		average=(sum1+sum2)/(numbers1.length+numbers2.length);
		remainder=(sum1+sum2)%(numbers1.length+numbers2.length);
		System.out.println("average= "+average);
		System.out.println("remainder= "+remainder);
	}
}
