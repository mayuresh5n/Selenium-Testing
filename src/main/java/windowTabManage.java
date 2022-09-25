import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class windowTabManage {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();
        driver.switchTo().window(childWindowId);
        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
        driver.switchTo().window(parentWindowId);

        WebElement nameE = driver.findElement(By.cssSelector("[name='name']"));
        nameE.sendKeys(courseName);
        File file = nameE.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\Mayuresh Nazare\\Desktop\\Udemy Coursework\\logo.png"));

        System.out.println(nameE.getRect().getDimension().getHeight());
        System.out.println(nameE.getRect().getDimension().getWidth());

        Thread.sleep(3000);
        driver.quit();
    }
}
