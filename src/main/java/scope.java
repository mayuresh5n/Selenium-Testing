/* Iterate through tabs and get the title name*/


import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.text.html.HTMLDocument;
import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class scope {

    public static void main(String[] args) throws InterruptedException {

//        ChromeOptions options =new ChromeOptions();
//        options.addArguments("--headless","--window-size=1920,1080");
//        WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement footertab = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(footertab.findElements(By.tagName("a")).size());

        for (int i = 1; i < footertab.findElements(By.tagName("a")).size(); i++) {

            String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footertab.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
            Thread.sleep(5000);
        }
            Set<String> tabName = driver.getWindowHandles();
            Iterator<String> ite = tabName.iterator();

            while (ite.hasNext()) {
                driver.switchTo().window(ite.next());
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
            }

            driver.close();
        }

}
