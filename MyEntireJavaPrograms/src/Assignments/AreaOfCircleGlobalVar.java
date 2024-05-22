package Assignments;

public class AreaOfCircleGlobalVar 
{
	final static double pi=3.14f;
	float r=5;

	public static void main(String[] args) 
	{
		AreaOfCircleGlobalVar area=new AreaOfCircleGlobalVar();
		System.out.println("Area of circle with radius "+ area.r+" = "+ (pi*area.r*area.r));
	}

}
