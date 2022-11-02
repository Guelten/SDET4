package Gun10;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _05_ActionHoverOverTest extends BaseDriver {

    @Test
    public void Test1()
    {
 //       Jewellery -> Neckless -> Bib Neckless click
 //       tıklatma işleminden sonra URL de
 //       bib-necklaces kelimesinin geçtiğini doğrulayın.


        driver.get("https://www.etsy.com/");

        // [data-gdpr-single-choice-accept='true']
        // 1- isDisplay ve isEnable gibi kontroller, element HTML nini içinde var fakat görünür değil.
        // durumunda kullanılır.
        // 2- BAZI durumlarda element HTML nini içinde hiç yoktur.

        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        // elementi bulamazsa imlicitly wait devreye girer ve verilen süre kadar bulmaya calisir
        if (cookiesAccept.size() > 0)  // varsa
            cookiesAccept.get(0).click(); // kapat


        WebElement mucevher = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye = driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        Myfunc.Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        Myfunc.Bekle(2);
        aksiyonlar.moveToElement(bibKolye).build().perform();
        Myfunc.Bekle(2);

        bibKolye.click();

        Assert.assertTrue("Url de bib Kolye varmi", driver.getCurrentUrl().contains("bib"));

        driverBekleKapat();

    }
}
