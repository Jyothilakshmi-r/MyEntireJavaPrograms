package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickNotWorkingSBIOnline
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement loginButton=driver.findElement(By.className("login_button"));
		loginButton.click();
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("ABC");
				
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys("ABC@123");
		
		WebElement captchaCode=driver.findElement(By.name("loginCaptchaValue"));
		captchaCode.sendKeys("ABC@123");
	}

}
