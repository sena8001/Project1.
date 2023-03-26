package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAttribute {
    public static void main(String[] args) {



            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");

            WebElement searcBox= driver.findElement(By.name("q"));

        System.out.println(searcBox.getAttribute("maxlength"));
        System.out.println(searcBox.getAttribute("title"));
        System.out.println(searcBox.getAttribute("data-ved"));

        List<WebElement> all_Links=driver.findElements(By.tagName("a"));

        for (WebElement all_link : all_Links) {
            System.out.println(all_link.getText()+ " : "  +all_link.getAttribute("href"));

        }













        }




    }
