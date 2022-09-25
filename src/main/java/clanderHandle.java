/*To handle Calander input*/

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class clanderHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ChromeOptions options = new ChromeOptions();

        driver.get("https://www.path2usa.com/travel-companion/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)", "");

        //driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
        Thread.sleep(2000);
//      while(!){
//          Thread.sleep(1000);
//
//
//      }

      for(int i=0;i<=12;i++)
      {
          driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
          Thread.sleep(300);
          String months = driver.findElement(By.className("cur-month")).getText();
          if(months.equalsIgnoreCase("April "))
          {
              System.out.println(driver.findElement(By.className("flatpickr-current-month")).getText());
              break;

          }
      }


        /*
        List<WebElement> days = driver.findElements(By.cssSelector(".flatpickr-day"));

        for (int i = 0; i < days.size(); i++) {

            String txt = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();

            if (txt.equalsIgnoreCase("20")) {

                driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
                break;

            }


        }*/
        driver.close();
    }
}
