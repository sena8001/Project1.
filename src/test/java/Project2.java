import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project2 {

    @Test
    public void Order() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);

        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();

        Thread.sleep(500);
        Integer productType = (int) (Math.random() * 3);
        Select dropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropdown.selectByIndex(productType);

        Thread.sleep(500);
        Integer randomQuantity = (int) (1+Math.random() * 100);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE, randomQuantity.toString());

        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        Thread.sleep(1500);
        Integer pricePerUnit = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).getAttribute("value"));
        Integer priceDiscount = Integer.parseInt(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).getAttribute("value"));
        Integer total;
        if (randomQuantity > 10) {
            total = (int) (randomQuantity * pricePerUnit * (double)(100-priceDiscount)/100);
        } else {
            total = randomQuantity * pricePerUnit;
        }
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("value"), total.toString(), "Invalid total value");

        List<List<String>> data =readFromCSV("MOCK_DATA_for SeleniumProject2.csv");
        int row =(int) (Math.random() * 1000);
        List <String> selectedRow = data.get(row);

        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(selectedRow.get(0));
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(selectedRow.get(1));
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(selectedRow.get(2));
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(selectedRow.get(3));
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(selectedRow.get(4));

        Thread.sleep(500);
        List <WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        int buttonIndex =(int) (Math.random() * 3);
        WebElement button = radioButtons.get(buttonIndex);
        button.click();

        String creditCardNumber;
        switch (buttonIndex){
            case 0:
                creditCardNumber="4"+randomDigits(15);
                break;
            case 1:
                creditCardNumber = "5" +randomDigits(15);
                break;
            case 2:
                creditCardNumber ="3" +randomDigits(15);
                break;
            default:
                creditCardNumber = "xxxxxxxxxxxxxxxx";
        }

        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(creditCardNumber);
        Thread.sleep(500);

        String expirationDate = "";
        Integer randomMonth = (int) (1+Math.random() * 12);
        Integer randomYear = (int) (23+Math.random() * 7);
        expirationDate += randomMonth+ "/"+ randomYear;
        if (expirationDate.length()<5){
            expirationDate="0"+expirationDate;
        }
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(expirationDate);


        Thread.sleep(500);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(500);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='buttons_process']/strong")).getText(),
                "New order has been successfully added.", "New order isn't processed.");

        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href='Default.aspx']")).click();
        Thread.sleep(500);
        List <WebElement> columns = driver.findElements(By.xpath("//tbody//tr[position()=2]//td"));
        Assert.assertEquals(columns.get(1).getText(), selectedRow.get(0), "The names don't match");
        Assert.assertEquals(columns.get(2).getText(), getProductType(productType), "Wrong product type");
        Assert.assertEquals(columns.get(5).getText(), selectedRow.get(1), "Wrong Street");
        Assert.assertEquals(columns.get(6).getText(), selectedRow.get(2), "Wrong city");
        Assert.assertEquals(columns.get(7).getText(), selectedRow.get(3), "Wrong state");
        Assert.assertEquals(columns.get(8).getText(), selectedRow.get(4), "Wrong zip code");
        Assert.assertEquals(columns.get(9).getText().toUpperCase(), getCardType(buttonIndex).toUpperCase(), "Invalid card type");
        Assert.assertEquals(columns.get(10).getText(), creditCardNumber, "Wrong card number");
        Assert.assertEquals(columns.get(11).getText(), expirationDate, "Wrong expiration date");
        Thread.sleep(500);
        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(1000);
        driver.quit();


    }
    public static List<List<String>> readFromCSV(String path)  {
        List<List<String>> converted = new ArrayList<>();
        try {
            List<String> rows = Files.readAllLines(Path.of(path));

            for (int i = 0; i < rows.size(); i++) {
                if (i == 0) {
                    continue;
                }
                List<String> each = Arrays.asList(rows.get(i).split(","));
                converted.add(each);
            }
        }catch (IOException ex) {
            System.out.println("File " + path + " does not exist");
        }
        return converted;
    }
    String randomDigits(int maxDigits){
        String randomNumbers = "";
        for (int i=0; i<maxDigits; i++){
            int numbers =  (int) (Math.random() * 10);
            randomNumbers+=numbers;
        }
        return randomNumbers;
    }

    String getCardType(int type){
        switch (type){
            case 0:
                return "VISA";

            case 1:
                return "MasterCard";

            case 2:
                return "American Express";

        }
        return "Invalid card type";
    }

    String getProductType(int productType){
        switch (productType){
            case 0:
                return "MyMoney";

            case 1:
                return "FamilyAlbum";

            case 2:
                return "ScreenSaver";

        }
        return "Invalid product type";
    }

}