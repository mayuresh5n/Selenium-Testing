import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class webPageAutomate {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.className("blinkingText")).click();


        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterate = windows.iterator();
        String parentID = iterate.next();
        String childID=iterate.next();
        driver.switchTo().window(childID);
        String EmailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(EmailId);
        driver.findElement(By.id("password")).sendKeys("WrongPass");
        driver.findElement(By.cssSelector("span[class='checkmark']")).click();
        driver.findElement(By.id("signInBtn")).click();
    }
}
