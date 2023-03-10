import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

    public static void main(String[] args) {


        //label[for='tree-node-home'] span.rct-checkbox

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        driver.manage().window().maximize();

        String homePage= "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement BOX= driver.findElement(new By.ByCssSelector(homePage));
         BOX.click();

         BOX=driver.findElement(new By.ByCssSelector(homePage));


         String homepageChecked=BOX.getAttribute("class");


             if (homepageChecked.equals("rct-icon rct-icon-check")){
                 System.out.println("checeked");

             }else{
                 System.out.println("noncheced");
             }
        }







    }

