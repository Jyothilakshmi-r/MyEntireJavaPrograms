package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SearchIndiaTagnameClassVal {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.cssSelector("textarea.gLFyf"));
		e1.sendKeys("India");
	    e1.sendKeys(Keys.ENTER);
	}

}
