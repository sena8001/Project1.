import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {




    @Test

    public void demo() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        driver.manage().window().maximize();
        WebElement Sign_up= driver.findElement(By.id("hideLogin"));
        Sign_up.click();


        Faker faker=new Faker();
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys(faker.internet().emailAddress());
        String last = email.getAttribute("value");
        driver.findElement(By.id("email2")).sendKeys(last);











    }
}
