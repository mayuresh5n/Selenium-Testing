import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sun.security.util.Password;

public class basicTestNg {
    @BeforeTest
    @Test(groups ="Smoke")
    @When("Once Hello is printed")
    @Given("Demo")
    public void demo() {
        {
            System.out.println("Hello");
        }
    }

    @When("Demo1")
    @Test(dataProvider ="loginData")
    public void demo1(String usrName, String password) {
        {
            System.out.println(usrName);
            System.out.println(password);
        }



        }
    @DataProvider()
    public Object[][] loginData() {

        Object[][] loginInfo = new Object[3][2];
        loginInfo[0][0]="user1";
        loginInfo[0][1]="pass1";

        loginInfo[1][0]="user2";
        loginInfo[1][1]="pass2";

        loginInfo[2][0]="user3";
        loginInfo[2][1]="pass3";

        return loginInfo;
    }
}

