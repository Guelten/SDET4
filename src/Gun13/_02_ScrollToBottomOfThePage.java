package Gun13;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Myfunc.Bekle(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // sayfa sonuna kadar kaydir.

        Myfunc.Bekle(2);
        js.executeScript("window.scrollTo(0, 0);");
        // sayfa basina git


        driverBekleKapat();


    }
}
