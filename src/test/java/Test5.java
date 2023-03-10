import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        String homePageButton="label[for=\"tree-node-home\"] span.rct-checkbox";

        WebElement checkButtonValue=driver.findElement(new By.ByCssSelector(homePageButton));
        checkButtonValue.click();
        checkButtonValue=driver.findElement(new By.ByCssSelector(homePageButton));

        String homePage=checkButtonValue.getAttribute("class");

        if (homePage.equals("rct-icon rct-icon-check")){
            System.out.println("t");
        }else{
            System.out.println("f");
        }













    }
}
