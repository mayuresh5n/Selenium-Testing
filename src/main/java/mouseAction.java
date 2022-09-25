import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouseAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Actions a = new Actions(driver);
        WebElement mouseHover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(mouseHover).build().perform();
        a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("AmazonBasics").doubleClick().build().perform();




    }
}
