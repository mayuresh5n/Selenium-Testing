import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class basicTestNg2 {
    @AfterSuite
   // @Test(groups ="Smoke")
    public void demo6(){
        System.out.println("Out");
    }
}
