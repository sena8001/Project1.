package day63;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class warmUp {



    @Test
    public void WarmUp() throws InterruptedException {


          Faker faker=new Faker();
          WebDriver wb=new ChromeDriver();
          wb.get("https://www.instagram.com/?__coig_restricted=1");
          wb.manage().window().maximize();
          Thread.sleep(500);

          wb.findElement(By.name("username")).sendKeys(faker.name().username());
          wb.findElement(By.name("password")).sendKeys(faker.internet().password(), Keys.ENTER);
          Thread.sleep(1000);

        System.out.println(wb.findElement(By.id("slfErrorAlert")).getCssValue("color"));




    }
}