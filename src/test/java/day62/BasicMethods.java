package day62;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicMethods {


    @Test
    public void basics() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com/");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.tesla.com/");

        String pageSource = driver.getPageSource();
        //   System.out.println(pageSource);

        String text = "Until March 2023, new Model 3 and Model Y vehicles qualify for a $7,500 federal tax credit for eligible buyers.";

        Assert.assertTrue(pageSource.contains(text));
        //     driver.quit();
        //   driver.close();


    }


    @Test
    public void navigate() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com/");
        Thread.sleep(500);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().forward();
        Thread.sleep(500);
        driver.navigate().refresh();


    }

    @Test
    public void locateAnElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");



        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();
        ////*[@class='button'] classname ile ararken boylr aranir

        Assert.assertEquals(driver.getTitle(),"Web Orders");

    }
}