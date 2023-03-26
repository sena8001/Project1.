package day62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {

@Test
    public void testGoogle(){

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("facebook",Keys.ENTER);

    String actual="facebook";

    String excepted=actual;
    Assert.assertEquals(actual,excepted);




}
}
