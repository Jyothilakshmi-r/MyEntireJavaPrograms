package basics_launch;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement accountandlist =driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		accountandlist.click();
		
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement signin=driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();

	}

}
