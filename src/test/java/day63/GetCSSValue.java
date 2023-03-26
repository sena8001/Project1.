package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {





    public static void main(String[] args) {  WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("cjnnvc");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("ghfghf");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("text-align"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("font-family"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color"));

        driver.close();












    }
}
