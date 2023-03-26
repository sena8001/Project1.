package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class LocateBynameClassName {
    public static void main(String[] args) {



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
     //   driver.findElement(By.className("gb_q")).click();

        driver.findElement(By.name("q")).sendKeys("ChaTGPT", Keys.ENTER);
        //locate all element by classname (all search result have the same class
       List<WebElement>all=driver.findElements(By.className("LC20lb"));
        for (WebElement element : all) {
            System.out.println(element.getText());

        }

    }
    }
