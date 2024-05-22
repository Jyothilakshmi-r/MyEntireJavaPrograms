package basicknowledge;

public class ByteToDoubleEg 
{
	public static void main(String[] args) 
	{
		byte age=82;
		long newAge=age; //implicitly 
		//long newAge= (long)age; //explicitly
		System.out.println(newAge);
		newAge=1000;
		System.out.println(newAge);
		
		long num1=1000;
		byte n1=(byte)num1;
		System.out.println("value of n1 = "+n1);//
	}

}
