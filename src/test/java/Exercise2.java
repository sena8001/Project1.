import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exercise2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("sena8001@gmail.com");

        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("sena8001@gmail.com");

        //button[starts-with('u_0_5')]
        driver.findElement(By.xpath("//button[starts-with(@id ,'u_0_5')]")).click();




    }
}
