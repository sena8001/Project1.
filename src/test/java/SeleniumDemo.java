import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumDemo {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/ ");

        WebElement searchBox=  driver.findElement(By.name("q"));
      
        
        String expect="ChatGPT";
        searchBox.sendKeys(expect, Keys.ENTER);

        String CURRENTtITLE=driver.getTitle();

if (CURRENTtITLE.contains(expect+"Dsfsdfvds")){
    System.out.println("passed");

}else{
    System.out.println("failed" + CURRENTtITLE);
}

    }
}
