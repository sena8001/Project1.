package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

    public static void main(String[] args) {


    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
     //   System.out.println(driver.findElement(By.className("hero-table-intro")).getText());
          driver.findElement(By.name("q")).sendKeys("chicken", Keys.ENTER);
        System.out.println(driver.findElement(By.name("q")).getAttribute("value"));
    }
}