import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        //  WindowsUtils.killByName("excel.exe");

        //	driver.manage().deleteCookieNamed("sessionKey");

        //click on any link
        //login page- verify login url


		/*	driver.get("http://google.com");

			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));*/

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//        driver.findElement(By.id("name")).sendKeys("Mayuresh");
//        driver.findElement(By.id("alertbtn")).click();
//        driver.switchTo().alert().accept();
//        driver.findElement(By.id("confirmbtn")).click();
//        driver.switchTo().alert().dismiss();
//    }
    }
}
