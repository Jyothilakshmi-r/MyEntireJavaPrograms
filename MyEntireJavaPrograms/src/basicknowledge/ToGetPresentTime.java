package basicknowledge;

import java.util.Date;

public class ToGetPresentTime {

	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1);
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
		System.out.println("Present Date");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
