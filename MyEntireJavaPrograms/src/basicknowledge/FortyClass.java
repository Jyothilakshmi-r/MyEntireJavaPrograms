package basicknowledge;

public class FortyClass 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary) 
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		
		//System.out.println("Name of the students is "+ name +"Age of the student is" + age + "Salary is " + salary);
	}
	public static void main(String[] args) 
	{
		FortyClass f1=new FortyClass();
		f1.student_details(90,"Ramu",9000);
		System.out.println(f1.name);
		System.out.println(f1.age);
		System.out.println(f1.salary);
	}

}
