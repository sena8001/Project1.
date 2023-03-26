package day62;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyExercis {


    @Test
    public void facebook() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        WebElement find = driver.findElement(By.name("q"));

        String checkBox = "facebook";


        String exceptedTitle = checkBox + " - Goole Search";
        find.sendKeys(checkBox, Keys.ENTER);

        String actualTitle = driver.getTitle();


     //   Assert.assertEquals(actualTitle, exceptedTitle,"error check pls");


    }

    @Test
    public void google() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        WebElement find = driver.findElement(By.name("q"));

        String checkBox1 = "instagram";

        String exceptedBox=checkBox1 +" - Google Search";

     find.sendKeys(checkBox1,Keys.ENTER);
     String actualTitle=driver.getTitle();

//     Assert.assertEquals(actualTitle,exceptedBox);
    }


@Test
public void demoAsertion(){
//
//        Assert.assertEquals("hello","Hddd");
//        Assert.assertNotEquals("gamse","gamse");

        Assert.assertTrue("S".contains("M"));

}




}