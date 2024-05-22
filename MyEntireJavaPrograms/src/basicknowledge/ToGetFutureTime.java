package basicknowledge;

import java.util.Date;

public class ToGetFutureTime {

	public static void main(String[] args)
	{
		System.out.println("CURRENT DATE");
		System.out.println("===============");
		Date d=new Date();
		d.getTime();
		String s1=d.toString();
		System.out.println(s1);
		System.out.println();
		
		//To get future time
		System.out.println("FUTURE DATE");
		System.out.println("===============");
		Date d1=new Date(d.getTime()+(60*60*1000*24*1));
		System.out.println(d1);
		System.out.println();
		
		//To get PAST date
		System.out.println("PAST DATE");
		System.out.println("===============");
		Date d3=new Date(d.getTime()-(60*60*1000*24*1));
		System.out.println(d3);
		
		
		
		
		
		
	/*	//System.out.println(d1);
		String s1=d1.toString();
		System.out.println(s1);
		String month=s1.substring(4, 7);
		System.out.println(month);
		String date=s1.substring(8, 10);
		System.out.println(date);
		System.out.println(s1.length());
		//String year=s1.substring(24);
		String year=s1.substring(s1.length()-4);
		System.out.println(year);
		
		System.out.println("===============");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	*/	
	

	}

}
