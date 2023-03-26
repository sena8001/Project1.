package day63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemoo {



    public static void main(String[] args) {



        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.xpath("html/body/div"));
        element.getText();
        driver.findElement(By.xpath("//input")).sendKeys("Full Xpath");


    }


}


