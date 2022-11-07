package Gun13;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    bu komutlar cogunlukla lazim olacak
    executeScript("window.scrollBy(0, 3000);");
    executeScript("window.scrollBy(0, -3000);");
    executeScript("arguments[0].scrollIntoView(true);", element);
    executeScript("arguments[0].click();", element);

 */

public class _01_Scrollintro extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");

        Myfunc.Bekle(2);
        // JavaScript komutlarini calistirmak icin önce js degiskeni tanimlandi.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000);");
        // (0,3000) -> (x,y) Sayfayi saga x kadar ve asagi y kaydirir
        // 3000 px kadar asagi kaydiracak.

        Myfunc.Bekle(2);
        js.executeScript("window.scrollBy(0, -3000);");  // - yukari cikar.

        // scrollTo : Verilen pixele gider. (direk verilene gider)
        // scrollBy : Verilen kadar daha ileri gider. (append) yapar

        Myfunc.Bekle(5);
        driverBekleKapat();


    }
}

