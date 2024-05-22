package basics_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.getTitle();
	}

}
