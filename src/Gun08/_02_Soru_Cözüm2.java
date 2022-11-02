package Gun08;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_Cözüm2 extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.facebook.com/");
        //driver.manage().deleteAllCookies();   // girildikten sonrada cookies ler silinmek icin

        Myfunc.Bekle(1);
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();

        Myfunc.Bekle(1);
        WebElement btnYeniHesap=driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();


        Myfunc.Bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("ismet");


        Myfunc.Bekle(1);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("temur");

        // #fullname_field+div+div   -->  WebElementi buldu, getattribute ile Class controlü yapti
        // Görünmüyor
        WebElement hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girmeden önce gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        Myfunc.Bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");


        // Görünüyor
        hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girdikten sonra gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));


        driverBekleKapat();


    }
}
