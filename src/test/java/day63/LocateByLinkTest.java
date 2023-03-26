package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocateByLinkTest {
    public static void main(String[] args) {



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

//        WebElement gmail= driver.findElement(By.linkText("Gmail"));
//        gmail.click();
//        WebElement About= driver.findElement(By.linkText("Images"));
//        About.click();
//
//        Assert.assertEquals(driver.getTitle(),"Google Images");Business

//        WebElement Business= driver.findElement(By.linkText("Business"));
//        Business.click();
//
//        Assert.assertEquals(driver.getTitle(),"Google for Small Business - Resources to get your small business online");
// How Search works

          WebElement x= driver.findElement(By.partialLinkText("How Search"));
        x.click();
    }


}
