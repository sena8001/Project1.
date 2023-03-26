package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateElementByTagName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.duotech.io/");

        System.out.println(driver.findElement(By.tagName("h1")).getText());


//print all links
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println("link amount is " + list.size());
        for (WebElement element : list) {
            System.out.println(element.getText());

        }
     //print all paragraf
        List<WebElement> paragraf=driver.findElements(By.tagName("p"));

        for (WebElement element : paragraf) {
            System.out.println(element.getText());

        }


    }
}
