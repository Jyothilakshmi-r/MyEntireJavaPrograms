package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Program 
{

	public static void main(String[] args) 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/itsme/OneDrive/Desktop/SOFTWARE%20TESTING-SELF%20STUDY/MKT%20Class/Files/learningHTML1.html");
	        driver.manage().window().maximize();

	        WebElement male_radio = driver.findElement(By.id("123"));
	        boolean b1=male_radio.isSelected();
	        

			if(b1==true)
			{
				System.out.println(" It is selected");
			}
			else
			{
				System.out.println("It is not selected");
				
				male_radio.click();
				
				System.out.println("After clicking th radio button, It is selected now");
			}
	}
}
