import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByClass {
    public static void main(String[] args) {


       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");

//       driver.findElement(By.className("MV3Tnb")).click();
//       WebElement link=driver.findElement(By.className("MV3Tnb"));
//       link.click();
//
//
//        List<WebElement>allLinks= (List<WebElement>) driver.findElement(By.className("MV3Tnb"));

       //       //class="MV3Tnb"


        driver.findElement(By.name("q")).sendKeys("ChatGPT", Keys.ENTER);


;
        List<WebElement>allp= (List<WebElement>) driver.findElement(By.className("LC20lb"));



for (WebElement result :  allp){
    System.out.println(result.getText());
}



    }
}
