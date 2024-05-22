package basicknowledge;

public class StudentNames {

	public static void main(String[] args)
	{	
		String names[]=new String[3];//declaration of array
		names[0]="Jyothi";
		names[1]="Nithin";
		names[2]="Shaik";
				
		int []rollno=new int[3];
		rollno[0]=77;
		rollno[1]=87;
		rollno[2]=12;
		
		char []gender=new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='M';
		
		System.out.println("Student Names" +"  " +"Roll No" + "  "+ "Gender");
		for(int i=0;i<=2;i++)
		{ 
			System.out.println(names[i] + "           " + rollno[i]+"       "+gender[i]);
		}
	}
}
