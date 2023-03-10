import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();

        WebElement checkBoxButton = driver.findElement(By.id("hobbies-checkbox-1"));

        Boolean isEnable = checkBoxButton.isEnabled();

        System.out.println(isEnable);

        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));


        if (isEnable) {
            try {
                System.out.println("entered try block");
                checkBoxButton.click();
            } catch (ElementClickInterceptedException e) {
                sportCheckboxLabel.click();
                System.out.println("Enter catch block");

            }

        }
        boolean isSelected=checkBoxButton.isSelected();
        System.out.println(isSelected);

    }

}