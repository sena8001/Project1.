package day71;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {

    @Test
    public void test() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(new CharSequence[]{"Tester"});
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(new CharSequence[]{"test"});
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Assert.assertEquals(driver.getTitle(),"Web Orders");
        driver.quit();


    }
    @Test
    public void test2() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(new CharSequence[]{"Te er"});
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(new CharSequence[]{"test"});
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Assert.assertEquals(driver.getTitle(),"Web Orders");
        driver.quit();



}
    @Test
    public void test3() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(new CharSequence[]{" "});
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(new CharSequence[]{"test"});
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Assert.assertEquals(driver.getTitle(),"Web Orders");
        driver.quit();



    }
    @Test
    public void test4() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(new CharSequence[]{" "});
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(new CharSequence[]{"tt"});
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Assert.assertEquals(driver.getTitle(),"Web Orders");
        driver.quit();



    }
}

