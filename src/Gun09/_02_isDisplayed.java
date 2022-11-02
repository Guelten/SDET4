package Gun09;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_isDisplayed extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");

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

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertFalse(reEmail.isDisplayed());


        Myfunc.Bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");


        reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertTrue(reEmail.isDisplayed());


        driverBekleKapat();
    }
}
