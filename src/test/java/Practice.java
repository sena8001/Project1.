import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

    public static void main(String[] args) throws InterruptedException {





            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        String username = "Tester";
        String password = "test";
        Thread.sleep(500);

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(username);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(password);
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(500);

        WebElement orderpage= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderpage.click();

        WebElement dropdown=driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct"));

        Select select=new Select(dropdown);
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("10");
        //ctl00_MainContent_fmwOrder_txtUnitPrice

        WebElement discount=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice"));
        discount.sendKeys("20");

        //ctl00_MainContent_fmwOrder_txtDiscount

        WebElement unitPrice=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal"));
        unitPrice.sendKeys("20");





    }
}
