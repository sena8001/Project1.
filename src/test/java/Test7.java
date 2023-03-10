import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();



        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

//       WebElement yesButton=driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
//        boolean isEnable= yesButton.isEnabled();
//
//        if (isEnable){
//            yesButton.click();
//            System.out.println("Clicked yes radio button");
//        }

        WebElement impButton=driver.findElement(new By.ByCssSelector("label[for='impressiveRadio']"));
        boolean isEnable= impButton.isEnabled();
        if (isEnable){
            impButton.click();
            System.out.println("Clicked yes radio button");
        }

        WebElement buttonIMP= driver.findElement(new By.ByCssSelector("label[for='gender-radio-2']"));
        boolean isSelceted=buttonIMP.isSelected();
        if (isSelceted){
            System.out.println("isSelected");
        }

        WebElement output=driver.findElement(By.className("mt-3"));
        System.out.println(output.getText());


        WebElement noRadiobuttom= driver.findElement(By.id("noRadio"));
        boolean isEn= noRadiobuttom.isEnabled();
        System.out.println(isEn);

















    }
}
