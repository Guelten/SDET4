package Sorucözümleri._Proje_4;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Akakce_com extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com/");

        WebElement hesapAc=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[1]"));
        hesapAc.click();
        Myfunc.Bekle(2);

        String name="Gülten";
        WebElement name1=driver.findElement(By.xpath("//*[@id='rnufn' and @name='rnufn']"));
        name1.sendKeys(name);
        Myfunc.Bekle(2);

        WebElement surName=driver.findElement(By.cssSelector("span[class='frm_v8']>input[id='rnufs']"));
        surName.sendKeys("Camp");
        Myfunc.Bekle(2);

        String emailGirilen="1231233dsd@gmail.com";
        WebElement email=driver.findElement(By.cssSelector("input[id='rnufe1']"));
        email.sendKeys(emailGirilen);
        Myfunc.Bekle(2);

        WebElement email2=driver.findElement(By.cssSelector("input[id='rnufe2']"));
        email2.sendKeys(emailGirilen);
        Myfunc.Bekle(2);

        String passwort="Hasan123";
        WebElement password1=driver.findElement(By.cssSelector("input[id='rnufp1']"));
        password1.sendKeys(passwort);
        Myfunc.Bekle(2);

        WebElement password2=driver.findElement(By.cssSelector("input[id='rnufp2']"));
        password2.sendKeys(passwort);
        Myfunc.Bekle(2);

        WebElement female=driver.findElement(By.cssSelector("input[id='rngf']"));
        female.click();
        Myfunc.Bekle(2);

        WebElement secim=driver.findElement(By.cssSelector("select[id='locpr']"));
        Select Menu=new Select(secim);

        Menu.selectByValue("33");

        WebElement ilce=driver.findElement(By.cssSelector("select[id='locds']"));
        Menu=new Select(ilce);
        Menu.selectByValue("413");

        WebElement dogumtarihiGun=driver.findElement(By.cssSelector("select[id='bd']"));
        Menu=new Select(dogumtarihiGun);
        Menu.selectByValue("22");

        WebElement dogumTarihiAy=driver.findElement(By.cssSelector("select[id='bm']"));
        Menu=new Select(dogumTarihiAy);
        Menu.selectByValue("6");

        WebElement dogumTarihiYil=driver.findElement(By.cssSelector("select[id='by']"));
        Menu=new Select(dogumTarihiYil);
        Menu.selectByValue("1995");

        WebElement sozlesme=driver.findElement(By.cssSelector("input[id='rnufpca']"));
        sozlesme.click();

        WebElement bildirim=driver.findElement(By.cssSelector("input[id='rnufnee']"));
        bildirim.click();

        WebElement hesapKayit=driver.findElement(By.cssSelector("input[id='rfb']"));
        hesapKayit.click();

        // isim bölümünü name degiskenine tanimlayarak test verisi degisse bile calismasini sagladik
        WebElement gülten=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        gülten.click();

        WebElement siparislerim=driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        siparislerim.click();

        WebElement siparisKontrol=driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.' or @class='no-record']"));
        siparisKontrol.getText();

        Myfunc.Bekle(2);

        gülten=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        gülten.click();

        WebElement mesajlarim=driver.findElement(By.xpath("//*[text()='Mesajlarım']"));
        mesajlarim.click();

        WebElement mesajKontrol=driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        mesajKontrol.getText();

        WebElement anaSayfa=driver.findElement(By.cssSelector("[title='Anasayfaya gitmek için tıklayın']"));
        anaSayfa.click();

        gülten=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        gülten.click();

        WebElement hesapSil=driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        hesapSil.click();

        WebElement sifreGir=driver.findElement(By.xpath("//*[@onfocusout='ControlPassword();']"));
        sifreGir.sendKeys(passwort);

        WebElement hesapSilTikla=driver.findElement(By.xpath("//*[@type='submit' and @value='Hesabımı sil']"));
        hesapSilTikla.click();

        driverBekleKapat();



    }


}
