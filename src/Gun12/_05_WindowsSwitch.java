package Gun12;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tab`lardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra ana sayfa ya dönününüz.
    ipucu : driver.switchTo().window(id) ile istenilen tab a geçiş yapılır
 */

public class _05_WindowsSwitch extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");

        String anaSayfaWindowID = driver.getWindowHandle(); // bulundugum sayfanin/window/tab ID sini aldim

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mailto"))
                link.click();


        // driver.getWindowHandle(); --> aktif olan tab (window) un id sini verir.
        Set<String> windowIdler = driver.getWindowHandles();  // acik olan tüm sayfalarin win id leri
        for (String id : windowIdler)
        {
            driver.switchTo().window(id);  // diger tab a (windowa) gecis yaptik
            System.out.println(id+ "-Title ="+ driver.getTitle()+" - URL: "+ driver.getCurrentUrl());
        }



       // TODO:
       // burada önce ana sayfaya gecelim.
        driver.switchTo().window(anaSayfaWindowID);

       // sonra ana sayfa harici digerlerini kapatalim.
        for (String id : windowIdler)
        {
            if (id.equals(anaSayfaWindowID))
                continue;  // sadece bu adimi pass gecti, kendin sonra gelenleri calistirmadi

            driver.switchTo().window(id);
            driver.close();  // sadece fulundugum window u kapatit
        }




        Myfunc.Bekle(5);
        driverBekleKapat();



    }
}