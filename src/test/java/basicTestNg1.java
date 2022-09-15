import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basicTestNg1 {
    @Test(dependsOnMethods = "demo5")
    public void demo2() {
        System.out.println("3");
    }

    @Test(groups ="Smoke")
    public void demo3() {
        System.out.println("4");
    }

    @Test
    public void demo4() {
        System.out.println("5");
    }

    @Test
    public void demo5() {
        System.out.println("6");
    }

}
