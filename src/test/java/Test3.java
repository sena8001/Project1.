import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");


        WebElement username=driver.findElement(By.id("email"));
        username.click();
        username.sendKeys("sena");
        //pass

        WebElement username1=driver.findElement(By.id("pass"));
        username1.click();
        username1.sendKeys("sena");

        //u_0_5_JT

        WebElement username3=driver.findElement(new By.ByCssSelector("button[name=\"login\"]"));
        username3.click();







    }
}
