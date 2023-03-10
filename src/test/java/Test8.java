import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Test8 {
    public static void main(String[] args){


        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");



//        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
//
//        Actions actions=new Actions(driver);
//        actions.doubleClick(doubleClickButton).perform();
//
//
//        WebElement message=driver.findElement(By.id("doubleClickMessage"));
//
//        String getMessage=message.getText();
//        System.out.println(getMessage);
//
//
//        WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
//        actions.contextClick(rightClickButton).perform();
//
//     WebElement message2=driver.findElement(By.id("rightClickMessage"));
//
//
//     String getMessage2=message2.getText();
//        System.out.println(getMessage2);

        ////div/button[starts-with(text() , 'Click Me')]

        WebElement clickMe= driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        clickMe.click();

        WebElement message3= driver.findElement(By.id("dynamicClickMessage"));
        String getMessage3=message3.getText();
        System.out.println(getMessage3);

















        }

    }

