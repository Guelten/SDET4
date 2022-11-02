package Gun09;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='click Me']"));
        //element.click();  normal click


        Actions aksiyonlar=new Actions(driver); //1
        System.out.println("aksiyon öncesi tüm aksiyonlari calistiracagimiz ana Aksiyonlar sinifi olusturuldu");

        Action aksiyon= aksiyonlar.moveToElement(element).click().build();
                                   // elementin üzerine gidildi, Click aksiyonu hazirda bekliyor, henüz click olmadi.
        System.out.println("Aksiyon hazirlandi");


        Myfunc.Bekle(2);
        aksiyon.perform();  // aksiyonu gerceklestir.
        System.out.println("Aksiyon gerceklesti");


        //aksiyonlar.moveToElement(element).click().build().perform(); // kisa hali.

        driverBekleKapat();



    }


}
