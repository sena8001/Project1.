package day62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));


        String searchTerm = " chatGPT";
        String expectedTitle=searchTerm + " Google Search";

        search.sendKeys(searchTerm, Keys.ENTER);

        String actualTitle = driver.getTitle();

       //nasil kontrol ederiz
//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println("Test Passed");
//        } else {
//            System.out.println("Test fail.The current title is  " +  actualTitle +"  the expected was"+  expectedTitle );
//
//
//        }
        Assert.assertEquals(actualTitle,expectedTitle);


    }
}