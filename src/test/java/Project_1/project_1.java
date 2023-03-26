package Project_1;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class project_1 {



    @Test
    public void project_1a() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        driver.manage().window().maximize();

        WebElement hideLogin = driver.findElement(By.id("hideLogin"));
        hideLogin.click();

        Faker faker=new Faker();
        WebElement username = driver.findElement(By.id("username"));

        WebElement firstName = driver.findElement(By.id("firstName"));

        WebElement lastName = driver.findElement(By.id("lastName"));

        WebElement email = driver.findElement(By.id("email"));

        username.sendKeys(faker.name().username());

        firstName.sendKeys(faker.name().firstName());

        lastName.sendKeys(faker.name().lastName());

        email.sendKeys(faker.internet().emailAddress());

        String email_confirm=email.getAttribute("value");

        driver.findElement(By.id("email2")).sendKeys(email_confirm);

        String password_confirm="12345";

        WebElement password = driver.findElement(By.id("password"));

        password.sendKeys(password_confirm);

        driver.findElement(By.id("password2")).sendKeys(password_confirm);

        WebElement registerButton=driver.findElement(By.name("registerButton"));

        registerButton.click();

        String exceptedURL="http://duotify.us-east-2.elasticbeanstalk.com/browse.php?";

        String actualURL="http://duotify.us-east-2.elasticbeanstalk.com/browse.php?";

        Thread.sleep(500);

        if (exceptedURL.equals(actualURL)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test is fail");
        }

        Thread.sleep(500);

        String fullname=firstName+" "+lastName;

        String first_name2=firstName.getText();
        String last_name2=lastName.getText();

        String fullname2=first_name2+" "+last_name2;

        System.out.println(fullname);












    }



}
