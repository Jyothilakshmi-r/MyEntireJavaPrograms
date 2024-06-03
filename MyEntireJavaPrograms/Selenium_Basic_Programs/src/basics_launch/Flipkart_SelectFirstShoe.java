package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_SelectFirstShoe
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("shoes");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		WebElement select=driver.findElement(By.xpath("(//div[@class='wvIX4U'])[1]"));
		select.click();
	}

}
