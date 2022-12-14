package Gun10;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*    Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */


public class _06_IntroAlert extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        Myfunc.Bekle(2);
        driver.switchTo().alert().accept();  // Alert kutucuguna gecildi ve OK buttonuna tiklandi.
        // OK bastigin anda asil sayfaya dönmüs oluyorsun

        Myfunc.Bekle(2);
        driverBekleKapat();


    }
}
