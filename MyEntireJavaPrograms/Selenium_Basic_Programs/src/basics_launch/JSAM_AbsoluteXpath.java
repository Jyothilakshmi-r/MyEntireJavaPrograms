package basics_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_AbsoluteXpath {

    public static void main(String[] args) throws InterruptedException 
    {
       
        EdgeDriver driver = new EdgeDriver();

        driver.get("file:///C:/Users/itsme/OneDrive/Desktop/SOFTWARE%20TESTING-SELF%20STUDY/MKT%20Class/Files/learningHTML1.html");
        driver.manage().window().maximize();

        WebElement un = driver.findElement(By.xpath("(/html/body/input)[1]"));
        un.sendKeys("jyothi");

        WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
        hint.sendKeys("My Name");

        WebElement pwd = driver.findElement(By.xpath("(/html/body/input)[3]"));
        pwd.sendKeys("AlaycheTrail1");

        WebElement firstname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
        firstname.sendKeys("Jyothilakshmi");

       // WebElement submitBtn1 = driver.findElement(By.xpath("(/html/body/form/input)[3]"));
       // submitBtn1.click();

        WebElement ckBoy = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
        ckBoy.click();

        WebElement ckGirl = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
        ckGirl.click();

        WebElement ckBaby = driver.findElement(By.xpath("(/html/body/form/input)[6]"));
        ckBaby.click();

     // WebElement submitBtn2 = driver.findElement(By.xpath("(/html/body/form/input)[7]"));
    //  submitBtn2.click();
        
        WebElement rdMale = driver.findElement(By.xpath("(/html/body/input)[4]"));
        rdMale.click();

        WebElement rdFemale = driver.findElement(By.xpath("(/html/body/input)[5]"));
        rdFemale.click();
        
        WebElement relBlore = driver.findElement(By.xpath("(/html/body/input)[6]"));
        relBlore.click();
        
        WebElement aboutUs=driver.findElement(By.xpath("(/html/body/a)[1]"));
        aboutUs.click();
        
        WebElement religion=driver.findElement(By.xpath("(/html/body/select)[1]"));
        Select s1=new Select(religion);
        s1.selectByValue("1");
        
        // WebElement signupBtn = driver.findElement(By.xpath("(/html/body/input)[7]"));
       //  signupBtn.click();

    }

}
