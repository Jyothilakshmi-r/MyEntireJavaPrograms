package basicknowledge;
import java.util.Scanner;


public class BooleanArrayEg1 {
	public static void main(String[] args) {
		

	Scanner s = new Scanner(System.in);
 
    boolean boolArray[] = new boolean[3];
   
    System.out.println("Enter 3 values for the array");
   
    for(int i = 0;i<(boolArray.length); i++) 
    { 
        System.out.print("Enter value of index " + i);
        boolArray[i] = s.nextBoolean();
    }

    
    s.close();
    System.out.println("The given boolean array is ");
    for(int i = 0; i < (boolArray.length); i++)
    {
        System.out.println("Value of index " + i + ": " + boolArray[i]);
    }
}
}
