package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin_RelXpath {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signIn=driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0/']"));
		signIn.click();
		
		WebElement emailTxt = driver.findElement(By.xpath("//input[@id='ap_email']"));
		emailTxt.sendKeys("luvujyothi@yahoo.co.in");
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));;
		password.sendKeys("kgdlsgksg");
		
		WebElement signin_button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin_button.click();
	}

}
