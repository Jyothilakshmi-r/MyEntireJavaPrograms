package basics_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ShoeAutosuggestion
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		//Thread.sleep(2000);
			
		
		
		List<WebElement> auto_suggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
int count=auto_suggestion.size();
System.out.println(count);
Thread.sleep(1000);
auto_suggestion.get(count-6).click();
	}

}
