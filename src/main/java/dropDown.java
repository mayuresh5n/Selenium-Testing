import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class dropDown {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

            driver.findElement(By.xpath(" //input[@id='autocomplete']")).sendKeys("Ind");
            Thread.sleep(2000);
             driver.findElement(By.xpath(" //input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath(" //input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.xpath(" //input[@id='autocomplete']")).getAttribute("value"));
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Mayuresh Nazare\\Desktop\\Udemy Coursework\\01.png"));





    }
}
