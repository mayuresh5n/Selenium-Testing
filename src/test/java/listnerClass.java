import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnerClass implements ITestListener{

    WebDriver driver=new ChromeDriver();
    @Override
    public void onStart(ITestContext result) {
        ITestListener.super.onStart(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Successful Execution  " +result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        driver.close();
    }

}

