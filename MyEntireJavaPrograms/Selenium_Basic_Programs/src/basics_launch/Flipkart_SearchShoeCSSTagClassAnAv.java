package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_SearchShoeCSSTagClassAnAv 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
	}
}
