package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GrotechMinds_HoverOver {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);

		/*	WebElement qn1=driver.findElement(By.xpath("(//div[@class='popup4'])"));
		Actions a1=new Actions(driver);
		a1.moveToElement(qn1).perform();
		WebElement practice3=driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		practice3.click();
	*/
		
	/*	WebElement qn2=driver.findElement(By.xpath("(//div[@class='popup4'])"));
		Actions a2=new Actions(driver);
		a2.moveToElement(qn2).perform();
		Thread.sleep(500);
		WebElement practice10=driver.findElement(By.xpath("(//div[@class='popup4'])[10]"));
		practice10.click();
	*/
		
	/*	WebElement qn1=driver.findElement(By.xpath("(//div[@class='popup7'])"));
		Actions a1=new Actions(driver);
		Thread.sleep(1000);
		a1.moveToElement(qn1).perform();
		WebElement practice1=driver.findElement(By.xpath("(//div[@class='popup7'])[1]"));
		practice1.click();
	*/
		
	/*	WebElement qn1=driver.findElement(By.xpath("(//div[@class='popup4'])"));
		Actions a1=new Actions(driver);
		a1.moveToElement(qn1).perform();
		WebElement practice6=driver.findElement(By.xpath("(//div[@class='popup4'])[6]"));
		practice6.click();
	*/	
		
	/*	WebElement qn1=driver.findElement(By.xpath("(//div[@class='popup4'])"));
		Actions a1=new Actions(driver);
		a1.moveToElement(qn1).perform();
		WebElement practice8=driver.findElement(By.xpath("(//div[@class='popup4'])[8]"));
		practice8.click();
	*/
		WebElement qn1=driver.findElement(By.xpath("(//div[@class='popup4'])"));
		Actions a1=new Actions(driver);
		a1.moveToElement(qn1).perform();
		WebElement practice9=driver.findElement(By.xpath("(//div[@class='popup4'])[9]"));
		practice9.click();
		
	}
}
