package Gun14;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;
import java.io.IOException;

public class _02_EkranKaydet extends BaseDriver{

    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> hataMesaji =  driver.findElements(By.cssSelector("div[role='alert']"));
        if (hataMesaji.size() > 0)
        {
            System.out.println("Login olamadi, Hata mesaji gözüktü");

            TakesScreenshot ts= (TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); //2.Aşama ekran görüntüsü alındı, şu an hafıda
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png"));


            // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
            //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
            //        bunu nasıl yaparsınız
            //        LocalDateTime alıcaksın bilgileri
            //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        }



        Myfunc.Bekle(3);
        driverBekleKapat();
    }
}
