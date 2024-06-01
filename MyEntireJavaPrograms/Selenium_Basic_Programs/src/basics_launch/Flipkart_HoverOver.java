package basics_launch;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_HoverOver {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		WebElement fashions =driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		//fashions.click();
		
		Actions a1=new Actions(driver);
		a1.moveToElement(fashions).perform();
		WebElement tShirts=driver.findElement(By.linkText("Men's T-Shirts"));
	    tShirts.click();
	}
}
