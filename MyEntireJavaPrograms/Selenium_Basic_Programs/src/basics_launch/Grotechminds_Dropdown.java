package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_Dropdown {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement qn1=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn2=driver.findElement(By.xpath("//select[@id='Choice2']"));
		WebElement qn3=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn4=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn5=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn6=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn7=driver.findElement(By.xpath("//select[@id='Choice1']"));
		WebElement qn8=driver.findElement(By.xpath("//select[@id='Choice1']"));
		
		
		Select s1=new Select(qn1);
		Select s2=new Select(qn2);
		Select s3=new Select(qn3);
		Select s4=new Select(qn4);
		Select s5=new Select(qn5);
		Select s6=new Select(qn6);
		Select s7=new Select(qn7);
		Select s8=new Select(qn8);
		
		
		s1.selectByVisibleText("Demo2");
		s2.selectByValue("practice15");
		//s3.selectByIndex(1);
		
//		s4.selectByValue("8");
	//	s5.selectByValue("2022");
	}

}
