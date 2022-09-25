/*SUm of total and table manipulation*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class scrollControl {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,200)", "");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.tableFixHead').scroll(0,2000)");
        //Xpath of 4th row element in table



        List<WebElement> tabEle = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));

        int sum = 0;
        for (int i = 0; i < tabEle.size(); i++) {
            sum += Integer.parseInt(tabEle.get(i).getText());
        }
        System.out.println(sum);

        String total = driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();

        int webTotal=Integer.parseInt(total);

        Assert.assertEquals(sum,webTotal);






        driver.close();

    }
}
