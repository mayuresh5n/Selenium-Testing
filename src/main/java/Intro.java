import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Intro {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        ChromeOptions options = new ChromeOptions();

//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");
//
//        URL remoteURL = new URL("http://localhost:4444/wd/hub");
//        WebDriver driver = new RemoteWebDriver(remoteURL, options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT'")).sendKeys("PNQ");
        Thread.sleep(3000);
        System.out.println("XYZ");
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("BLR");
        Thread.sleep(5000);
        System.out.println("XY-Z");
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(3000);

   //     driver.close();


//        driver.quit();

        driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
        for(int i=1;i<5;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

     //   driver.close();

    }
}





















//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//         //   driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//   //     System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//   //     System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//   //     Assert.assertFalse(false);
////        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
//       // System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
// //       Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected(),"Checkbox is checked");
//        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
//        {
//            System.out.println("Enabled");
//            Assert.assertTrue(true);
//        }else{
//           Assert.assertTrue(false);
//       }
//
//
//
//            Thread.sleep(3000);
//            List<WebElement> drpList= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//        for(WebElement drpLists: drpList) {
//            System.out.println(drpLists.getText());
//            if(drpLists.getText().equalsIgnoreCase("India")){
//
//                drpLists.click();
//                break;
//            }
//
//            }
//        driver.close();
//    }
//
//
//    }
//
//      /*  //Variables Declararions
//
//        String username = "User";
//        ChromeOptions option=new ChromeOptions();
//        WebDriver driver = new ChromeDriver(option);
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        option.addArguments("start-maximized");
//        Thread.sleep(2000);
//
//        //Locators
//        WebElement signin= driver.findElement(By.id("inputUsername"));
//        WebElement passw=driver.findElement(By.name("inputPassword"));
//        WebElement signinbtn= driver.findElement(By.xpath("//button[contains(@class,'submit')]"));
//        WebElement Orgname= driver.findElement(By.xpath("(//h1)[3]"));
//        Assert.assertEquals(Orgname.getText(),"Rahul Shetty Academy");
//        //Operations
//        signin.sendKeys(username);
//        passw.sendKeys("password");
//        Orgname.getText();
//        signinbtn.click();
//
//        driver.close();
//
//    }
//
//    public static String sendPass(WebDriver driver){
//
//        String passw=(driver.findElement(By.name("inputPassword"));
//
//        return passw;
//    }
//}*/
///*
//
//        ChromeOptions option=new ChromeOptions();
//        option.addArguments("start-maximized");
//        WebDriver driver =new ChromeDriver(option);
//        driver.get("https://www.google.com");
//        System.out.println("Title is:   "+driver.getTitle());
//        System.out.println("URL is:     "+driver.getCurrentUrl());
//        driver.findElement(By.name("q")).sendKeys("Amazon");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//        // System.out.println( driver.findElement(By.xpath(("//a[@href=\"https://www.amazon.com/\"]"))).getText());
//        WebElement Visit = driver.findElement(By.xpath(("//a[@href=\"https://www.amazon.com/\"]")));
//        System.out.println("Search text is: "+Visit.getText());
//        Visit.click();
//        WebElement searchKey= driver.findElement(By.id("twotabsearchtextbox"));
//        searchKey.sendKeys("Echo Dot");
//        searchKey.sendKeys(Keys.ARROW_DOWN);
//        searchKey.sendKeys(Keys.ENTER);
//        driver.close();
//
//
///*
//
//        import java.time.Duration;
//
//
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//
//
//        public class Locators {
//
//
//
//            public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
////implicit wait - 2 seconds time out
//
//                System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
//
//                WebDriver driver = new ChromeDriver();
//
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//                driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//                driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//                driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//                driver.findElement(By.className("signInBtn")).click();
//
//                System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//                driver.findElement(By.linkText("Forgot your password?")).click();
//
//                Thread.sleep(1000);//
//
//                driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//                driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//                driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//                driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//                driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//                System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//                driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//                Thread.sleep(1000);
//
//                driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//                driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//
//                driver.findElement(By.id("chkboxOne")).click();
//
//                driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//
//            }
//
//
//
//        }
//*/
//
