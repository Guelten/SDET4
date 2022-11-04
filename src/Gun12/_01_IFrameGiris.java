package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  // "frame1" id ve name ve webelement gecisi cok yavas
        WebElement input = driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Türkiye");

        // su anda frame1 ile gösterilen sayfadayiz, diger frame2 veya 3 veya ilk sayfamizdaki
        // locator lari bulamayiz, cünkü driver su anda frame1 isimli sayfayi DRIVE etmekte.


        // 1 - driver.switchTo().frame(0); --> icteki frame3 e gecis olur
        // 2 - driver.switchTo().parentFrame(); --> bir önceki sayfaya geri dönerim
        // 3 - driver.switchTo().defaultContent(); --> hangi sayfada olursan ol ilk sayfaya direk gecis



        driverBekleKapat();



    }
}
