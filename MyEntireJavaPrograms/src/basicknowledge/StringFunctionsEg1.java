package basicknowledge;


public class StringFunctionsEg1 {

	public static void main(String[] args) 
	{
		String name="School";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('l'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is ABC Public School"));
		String first_name="Jyothi";
		String last_name="Lakshmi";
		System.out.println(first_name.concat(last_name));
		System.out.println(first_name.concat(" ").concat(last_name));
		System.out.println(name.contains("Sch"));
		
	}

}
