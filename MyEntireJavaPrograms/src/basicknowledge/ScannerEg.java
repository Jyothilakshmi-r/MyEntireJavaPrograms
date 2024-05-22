package basicknowledge;

import java.util.Scanner;

public class ScannerEg {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		String s2=s1.next();
		String s3=s1.nextLine();
		System.out.println(s2);
		System.out.println(s3);
		s1.close();

	}
	

}
