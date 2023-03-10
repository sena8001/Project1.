import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dynamic_Code {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");


        WebElement text= driver.findElement(By.xpath("//div/p"));
        String get_Text= text.getText();
        System.out.println(get_Text);



        WebElement fistbutton= driver.findElement(By.id("enableAfter"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(fistbutton));
        fistbutton.click();









    }
}