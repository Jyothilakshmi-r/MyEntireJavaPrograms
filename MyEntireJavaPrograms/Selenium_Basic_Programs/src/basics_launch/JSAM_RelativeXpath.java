package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_RelativeXpath {

    public static void main(String[] args) throws InterruptedException 
    {
       
        EdgeDriver driver = new EdgeDriver();

        driver.get("file:///C:/Users/itsme/OneDrive/Desktop/SOFTWARE%20TESTING-SELF%20STUDY/MKT%20Class/Files/learningHTML1.html");
        driver.manage().window().maximize();

        WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
        un.sendKeys("jyothi");

        WebElement hint = driver.findElement(By.xpath("//input[@name='say hello']"));
        hint.sendKeys("My Name");

        WebElement pwd = driver.findElement(By.xpath("//input[@id='3']"));
        pwd.sendKeys("AlaycheTrail1");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
        firstname.sendKeys("Jyothilakshmi");

       // WebElement submitBtn1 = driver.findElement(By.xpath("(/html/body/form/input)[3]"));
       // submitBtn1.click();

        WebElement ckBoy = driver.findElement(By.xpath("//input[@name='name1']"));
        ckBoy.click();

        WebElement ckGirl = driver.findElement(By.xpath("//input[@name='name2']"));
        ckGirl.click();

        WebElement ckBaby = driver.findElement(By.xpath("//input[@name='name3']"));
        ckBaby.click();

        //WebElement submitBtn2 = driver.findElement(By.xpath("(/html/body/form/input)[7]"));
        //submitBtn2.click();
        
       // WebElement rdMale = driver.findElement(By.xpath("//input[text()='Male')]"));
        //rdMale.click();

        //WebElement rdFemale = driver.findElement(By.xpath("(/html/body/input)[5]"));
        //rdFemale.click();
        
        //WebElement relBlore = driver.findElement(By.xpath("(/html/body/input)[6]"));
        //relBlore.click();
        
      //  WebElement aboutUs=driver.findElement(By.xpath("//a[@href='https://grotechminds.com/']"));
        //aboutUs.click();
        
        WebElement religion=driver.findElement(By.xpath("//select[@value='1']"));
        Select s1=new Select(religion);
        s1.selectByValue("1");
        
        WebElement signupBtn = driver.findElement(By.xpath("//input[@value='Sign Up']"));
        signupBtn.click();

    }

}
