package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_login {

	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("luvujyothi@yahoo.co.in");
		driver.findElement(By.id("pass")).sendKeys("kgdlsgksg");
		driver.findElement(By.name("login")).click();
	}

}
