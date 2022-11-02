package Gun10;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_DragAndDropBy extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        // solSurgu.getSize().width;
        // 2.sürgü div[id='slider-range']>:nth-child(3)
        Myfunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.dragAndDropBy(solSurgu,100,0).build();
        Myfunc.Bekle(2);

        aksiyon.perform();

        driverBekleKapat();

    }

}


//  sürgünün boyutu 500$
//
//
//   sürgünün boyutunu / 500 => her 1 dolar icin
//   sürgününün ilerletilmesi gereken uzunlugu verir
//   birim uzunlugu verir
//
//   150$ icin => birim uzunluk*150
