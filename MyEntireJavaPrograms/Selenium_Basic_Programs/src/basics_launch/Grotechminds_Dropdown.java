package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement qn1=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn2=driver.findElement(By.xpath("//select[@id='Choice9']"));
		WebElement qn3=driver.findElement(By.xpath("//select[@id='Choice6']"));
		WebElement qn4=driver.findElement(By.xpath("//select[@id='Choice8']"));
		WebElement qn5=driver.findElement(By.xpath("//select[@id='Choice4']"));
				
		Select s1=new Select(qn1);
		Select s2=new Select(qn2);
		Select s3=new Select(qn3);
		Select s4=new Select(qn4);
		Select s5=new Select(qn5);
		
		s1.selectByVisibleText("Demo2");
		Thread.sleep(250);
		s2.selectByValue("SQL15");
		Thread.sleep(250);
		s3.selectByValue("Night10");
		Thread.sleep(250);
		s4.selectByVisibleText("QTP10");
		Thread.sleep(250);
		s5.selectByVisibleText("Energy15");
		Thread.sleep(250);
		s4.selectByVisibleText("QTP9");
		Thread.sleep(250);
		s5.selectByVisibleText("Energy14");
		Thread.sleep(250);
		s4.selectByVisibleText("QTP8");
		Thread.sleep(250);
		s5.selectByVisibleText("Energy13");
		Thread.sleep(250);
		s4.selectByVisibleText("QTP7");
		Thread.sleep(250);
		s5.selectByVisibleText("Energy12");
		Thread.sleep(250);
		s4.selectByVisibleText("QTP6");
		Thread.sleep(250);
		s5.selectByVisibleText("Energy11");
	}

}
