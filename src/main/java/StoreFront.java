import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.security.PublicKey;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class StoreFront {
@BeforeTest
 public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //  w.until(ExpectedCondition.vis);
        String[] itemNeeded = {"Brocolli", "Cucumber", "Cauliflower", "Beetroot"};
        addItems(driver, itemNeeded);
        cartItems(driver);
        BeforeMethod();
        AfterMethod(driver);
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
 }
   // @BeforeMethod
    @Test
    public static void BeforeMethod(){
        System.out.println("Web Driver Started successfully");

    }
    @Test
    public static void addItems(WebDriver driver, String[] itemNeeded) throws InterruptedException {
        int j = 0;
        List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < productName.size(); i++) {

            String[] name = productName.get(i).getText().split("-");
            String formatNeeded = name[0].trim();
            List itemsNeededList = Arrays.asList(formatNeeded);
            if (itemsNeededList.contains(formatNeeded)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                Thread.sleep(1000L);
                if (j == itemNeeded.length)
                    break;
            }

        }

    }
    @Test
    public static void cartItems(WebDriver driver) {

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button[@type='button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class='promoWrapper']/input[@class='promoCode']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        WebElement success = driver.findElement(By.xpath("//span[@class='promoInfo']"));
        //
        if (success.getText().equals("Code applied ..!")) {
            Assert.assertTrue(true, "Success");
            System.out.println("Code Applied");
        } else {
            Assert.assertFalse(false, "failure");
            System.out.println("Incorrect code.");

        }

    }
    @Test
 //   @AfterMethod
    public static void AfterMethod(WebDriver driver){
        driver.close();
        System.out.println("Driver closed successfully");
    }
}

