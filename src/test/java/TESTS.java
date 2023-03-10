import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTS {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();




        WebElement name=driver.findElement(By.id("userName"));
        name.click();
        name.sendKeys("Sena");

        WebElement name1=driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]"));
        name1.click();
        name1.sendKeys("Sena8001cgf@gmail.com");

        WebElement name2=driver.findElement(new By.ByCssSelector("textarea.form-control[placeholder"));
        name2.click();
        name2.sendKeys("Sena8001hgv@gmail.com");

        WebElement name11=driver.findElement(By.id("permanentAddress"));
        name11.click();
        name11.sendKeys("Sena");



        WebElement name112=driver.findElement(new By.ByCssSelector("button.btn"));
        name112.click();



    }
}
