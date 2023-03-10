import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement firstName= driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder= \"Full Name\"]"));
        firstName.click();
        firstName.sendKeys("Charlie Casper");

        WebElement email= driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]"));
        email.click();
        email.sendKeys("sena@gmail.com");

        WebElement current_Address=driver.findElement(new By.ByCssSelector("textarea.form-control[placeholder=\"Current Address\"]"));
        current_Address.click();
        current_Address.sendKeys("Adana");

        WebElement per_address=driver.findElement(By.id("permanentAddress"));
        per_address.click();
        per_address.sendKeys("Virginia");



         WebElement submit1=driver.findElement(new By.ByCssSelector("button.btn"));
         submit1.click();









    }
}
