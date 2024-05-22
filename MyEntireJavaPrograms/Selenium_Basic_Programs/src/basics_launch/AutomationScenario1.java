package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScenario1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
	}

}
