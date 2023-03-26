import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project1 {
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        String expectedTitle ="Welcome to Duotify!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "The title is wrong");
        driver.findElement(By.id("hideLogin")).click();

        Faker faker = new Faker();

        String fakeUserName = faker.internet().emailAddress();
        String fakeFirstName = faker.address().firstName();
        String fakeLastName = faker.address().lastName();
        String fakeEmail = fakeUserName;
        String fakePassword = faker.internet().password();

        driver.findElement(By.id("username")).sendKeys(fakeUserName);
        driver.findElement(By.id("firstName")).sendKeys(fakeFirstName);
        driver.findElement(By.id("lastName")).sendKeys(fakeLastName);
        driver.findElement(By.id("email")).sendKeys(fakeEmail);
        driver.findElement(By.id("email2")).sendKeys(fakeEmail);
        driver.findElement(By.id("password")).sendKeys(fakePassword);
        driver.findElement(By.id("password2")).sendKeys(fakePassword);

        driver.findElement(By.name("registerButton")).click();

        Thread.sleep(500);
        String expectedUrl = "http://duotify.us-east-2.elasticbeanstalk.com/browse.php?";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL is doensnt work");

        Assert.assertEquals(driver.findElement(By.id("nameFirstAndlast")).getText(), fakeFirstName+" "+fakeLastName);
        driver.findElement(By.id("nameFirstAndlast")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.className("userInfo"));
        Assert.assertEquals(element.findElement(By.tagName("h1")).getText(), fakeFirstName+" "+fakeLastName);
        driver.findElement(By.id("rafael")).click();

        Thread.sleep(500);
        Assert.assertEquals(driver.getCurrentUrl(), "http://duotify.us-east-2.elasticbeanstalk.com/register.php", "URL is doesn't work");

        driver.findElement(By.id("loginUsername")).sendKeys(fakeUserName);
        driver.findElement(By.id("loginPassword")).sendKeys(fakePassword);
        driver.findElement(By.name("loginButton")).click();

        Assert.assertEquals(driver.findElement(By.className("pageHeadingBig")).getText(), "You Might Also Like", "Text wasn't found");

        driver.findElement(By.id("nameFirstAndlast")).click();
        Thread.sleep(500);
        driver.findElement(By.id("rafael")).click();

        Thread.sleep(500);
        Assert.assertEquals(driver.getCurrentUrl(), "http://duotify.us-east-2.elasticbeanstalk.com/register.php", "URL is wrong");



    }

}
