package basics_launch;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_BrowsersEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver EdgeObject=new EdgeDriver();
		EdgeObject.get("https://www.google.com");
		EdgeObject.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(EdgeObject.getWindowHandle());
		System.out.println(EdgeObject.getWindowHandles());
	}

}
