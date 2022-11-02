package Gun10;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)  // kutucuga git
                .click()                 // icine tiklat
                .keyDown(Keys.SHIFT)     // Shift bas
                .sendKeys("a")           // a ya bas
                .keyUp(Keys.SHIFT)       // Shift birak
                .sendKeys("hmet")        // hmet yaz
                .build();

        Myfunc.Bekle(2);
        aksiyon.perform();

        driverBekleKapat();


    }
}
