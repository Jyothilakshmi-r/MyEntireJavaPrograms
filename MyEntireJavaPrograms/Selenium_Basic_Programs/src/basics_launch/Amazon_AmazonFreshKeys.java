package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AmazonFreshKeys {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement e1=driver.findElement(By.xpath("//select[@id='nav-search-dropdown']"));
		e1.click();
		
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		
	//	Select s1=new Select(e1);
		//s1.selectByValue("search-alias=shoes");
		
	}

}
//driver.findElement(By.name("q")).sendKeys("India");
//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);