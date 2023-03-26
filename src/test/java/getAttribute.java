import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {


        Faker faker=new Faker();
        WebDriver driver=new ChromeDriver();
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        driver.manage().window().maximize();

        WebElement emeal =driver.findElement(By.id("emeal"));
        String last= emeal.getAttribute("value");
















    }
}
