import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WarmUP {

    static WebDriver driver=new ChromeDriver();
    @Test

    public void warmUP() {


        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();






    }
}
