package basics_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SelectFirstShoe
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement selection=driver.findElement(By.xpath("(//span[@class='rush-component'])[4]"));
		Thread.sleep(1000);
		selection.click();
	}

}
