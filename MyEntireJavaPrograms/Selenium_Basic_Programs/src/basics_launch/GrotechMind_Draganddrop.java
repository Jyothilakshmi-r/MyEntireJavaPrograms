package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrotechMind_Draganddrop {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement e =driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement e1 =driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e,e1).perform();
		a1.dragAndDrop(e1,e).perform();
		

	}

}
