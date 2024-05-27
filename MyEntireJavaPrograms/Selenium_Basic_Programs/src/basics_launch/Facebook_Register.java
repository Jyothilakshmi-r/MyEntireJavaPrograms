package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Register {

	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));		
				
		Select s1=new Select(day);
		Select s2=new Select(month);
		Select s3=new Select(year);
		
		driver.findElement(By.name("firstname")).sendKeys("jyothilakshmi");
		driver.findElement(By.name("lastname")).sendKeys("radhadevi");
		driver.findElement(By.name("reg_email__")).sendKeys("9024033292");
		driver.findElement(By.id("password_step_input")).sendKeys("AlaycheTrail1");
		s1.selectByVisibleText("2");
		s2.selectByValue("3");
		s3.selectByIndex(41);
		
		driver.findElement(By.name("login")).click();
	}

}
