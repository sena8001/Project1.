import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac_form {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.click();
        firstname.sendKeys("Sena");

        WebElement lastname=driver.findElement(By.id("lastName"));
        lastname.click();
        lastname.sendKeys("SIMSIR");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("sena4545@gmail.com");

        WebElement gender=driver.findElement(new By.ByCssSelector("label[for='gender-radio-2']"));

        boolean isEnable= gender.isEnabled();
       if (isEnable){
           gender.click();
           System.out.println("yes did");
       }
//userNumber
//
WebElement userNumber=driver.findElement(By.id("userNumber"));
       userNumber.click();
       userNumber.sendKeys("544565466");

       WebElement subject=driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
       subject.click();
       subject.sendKeys("lalalal");














    }
}
