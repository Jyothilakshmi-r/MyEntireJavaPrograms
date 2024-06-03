package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_SearchShoeCSSClassname 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("shoes");
		driver.findElement(By.cssSelector(".Pke_EE")).sendKeys(Keys.ENTER);
	}
}
