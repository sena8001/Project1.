import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



    public class tesla{

        public static void main(String[] args) {


            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.tesla.com/");

            String currentURL = driver.getCurrentUrl();
            Assert.assertEquals(currentURL, "https://www.tesla.com/");

            String pageSource=driver.getPageSource();
//            System.out.println(pageSource);

            String text="Until March 2023, new Model 3 and Model Y vehicles qualify for a $7,500 federal tax credit for eligible buyers. Learn More";
        //    Assert.assertEquals(pageSource.contains(text));

        }
    }