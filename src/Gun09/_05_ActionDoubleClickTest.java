package Gun09;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("doubleClickBtn"));
        Myfunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);  // sinif olusturma
        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();  //aksiyon hazirlama
        aksiyon.perform(); // action

        Myfunc.Bekle(2);

        //new Actions(driver).moveToElement(element).doubleClick().build().perform();
        driverBekleKapat();


    }



}
