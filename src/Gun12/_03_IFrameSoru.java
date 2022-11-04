package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames%22); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);  // frame1 icind eki ilk frame gecis yaptik : frame3
        WebElement checkbox = driver.findElement(By.id("a"));  // xpath ile --> //input[@id='a'] böylede yapilabinir.
        checkbox.click();

 //       driver.switchTo().parentFrame();  // frame 1 e gecis
 //       driver.switchTo().parentFrame();  // ilk sayfaya gecis

        driver.switchTo().defaultContent();  // yukaridaki 2 satirin yerine direk ilk sayfaya gecis

        driver.switchTo().frame(1);  // select in oldugu frame(frame2), ilk sayfadaki 2. yane index olarak 1 olan frame

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddMenu = new Select(menu);
        ddMenu.selectByIndex(3);  // 4 nolu eleman secildi : son eleman: ddMenu.getOptions().size()-1


        driverBekleKapat();




    }
}
