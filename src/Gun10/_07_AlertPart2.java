package Gun10;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart2 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe1.click();

        Myfunc.Bekle(2);
        driver.switchTo().alert().dismiss();  // Alert kutucuguna gecildi ve CANCEL (iptal) buttonuna tiklandi.


        Myfunc.Bekle(2);

        driverBekleKapat();

    }
}
